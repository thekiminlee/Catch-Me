# Catch-Me

![alt tag](https://github.com/thekiminlee/Catch-Me/blob/master/src/Catch%20Me%20Demo.gif)

*** STILL UNDER DEVELOPMENT ***

Catch Me:
  
Simple ball catching game for Android mobile phones.

When the user touches the start screen, game starts right away.

Ball falls from the top and user touches again to activate the "bricks" that will catch the falling ball.

Ball's falling velocity increase at a stable rate.

INCLUDED IN THE SRC FOLDER: packages

  Animation
  
     Includes all the "objects" of the game (ball and brick).
     
     Ball's and brick's velocity is adjustable (Not implemented yet)
     
  Scene
  
    Includes the game stage.
    
    Updates the level and score on the screen. (Not implemented yet)
    
  States
  
    Includes all the "states" of the game.
    
    Default is start state. Does not go back unless application is restarted.
    
    Play state and End state is repeated for actual game
    
  com/donttouch/kimin
  
    Main class for game.

Developed with Java, libGdx
