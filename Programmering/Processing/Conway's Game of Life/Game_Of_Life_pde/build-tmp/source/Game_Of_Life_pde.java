import processing.core.*; 
import processing.data.*; 
import processing.event.*; 
import processing.opengl.*; 

import java.util.HashMap; 
import java.util.ArrayList; 
import java.io.File; 
import java.io.BufferedReader; 
import java.io.PrintWriter; 
import java.io.InputStream; 
import java.io.OutputStream; 
import java.io.IOException; 

public class Game_Of_Life_pde extends PApplet {

public void setup()
{
  
  
  board = new boolean[rows][cols];
  next = new boolean[rows][cols];
  cellWidth = width / cols;
  cellHeight = height / rows;
  
  board[0][5] = true;
  board[1][5] = true;
  board[2][10] = true;
  board[3][5] = true;
  
  println(countLiveCells(0, 4));
  println(countLiveCells(2, 5));
  println(countLiveCells(5, 99));
}

boolean[][] board;
boolean[][] next;
int cols = 100;
int rows = 100;
int cellWidth;
int cellHeight;

public int countLiveCells(int row, int col)
{
  int count = 0;
  if (row > 0 && col > 0 && board[row - 1][col -1]) 
  {
    count ++;
  }
  if (row > 0 && board[row - 1][col]) 
  {
    count ++;
  }
  if (row > 0 && col < cols - 1 && board[row - 1][col + 1]) 
  {
    count ++;
  }
  if (col > 0 && board[row][col -1]) 
  {
    count ++;
  }
  if (col < cols - 1 && board[row][col + 1]) 
  {
    count ++;
  }
  if (col > 0 && row < rows - 1 && board[row + 1][col -1]) 
  {
    count ++;
  }
  if (row < rows - 1 && board[row + 1][col]) 
  {
    count ++;
  }
  if (row < rows - 1 && col < cols -1 && board[row + 1][col + 1]) 
  {
    count ++;
  }
  
  return count;
}

public void mouseToBoard()
{
  int row = mouseY / cellHeight;
  int col = mouseX / cellWidth;
  board[row][col] = true;  
}

public void mousePressed()
{
  mouseToBoard();
}

public void mouseDragged()
{
  mouseToBoard();
}

public void updateBoard()
{
   for(int row = 0 ; row < rows ; row ++)
   {
     for (int col = 0 ; col < cols ; col ++)
     {
       int count = countLiveCells(row, col);
       next[row][col] = false;
       if (board[row][col])
       {
         if (count < 2)
         {
           next[row][col] = false;
         }
         if (count == 2 || count == 3)
         {
           next[row][col] = true;
         }
         if (count > 3)
         {
           next[row][col] = false;
         }
       }
       else
       {
         if (count == 3)
         {
           next[row][col] = true;
         }
       }
     }
   }
   boolean[][] temp = board;
   board = next;
   next = temp;
}

public void draw()
{

  for (int row = 0 ; row < rows ; row ++)
  {
    for (int col = 0 ; col < cols ; col ++)
    {
      float x = col * cellWidth;
      float y = row * cellHeight;
      stroke(50);
      if (board[row][col])
      {
        fill(0, 255, 255);        
      }
      else
      {
        fill(0);        
      }
      rect(x, y, cellWidth, cellHeight);
    }
  }
  
  updateBoard();
}
  public void settings() {  size(800, 600); }
  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "Game_Of_Life_pde" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
