class Cipher {
  private String[][] letterBlock;
  private int numRows;
  private int numCols;

  // Constructor: parameters include number of rows, number of columns

  public Cipher(int r, int c) {
    numRows = r;
    numCols = c;
    letterBlock = new String[numRows][numCols];
  }

  // method fillBlock(): places a String into letterBlock in row major order
  // @param str: the String to be processed
  // POSTCONDITION: if str.length() < numRows * numCols, "A" is placed in each unfilled cell
  // POSTCONDITION: if str.length() > numRows * numCols, trailing characters are ignored

  private void fillBlock(String str) {
    for( int row = 0; row < letterBlock.length; row ++){
      for(int col =0; col < letterBlock[row].length; col ++){
        if(str.length() > 0){
          letterBlock[row][col] = str.substring(0,1);
          str = str.substring(1, str.length());
        }
          else{
            letterBlock[row][col] = "A";
          }
        }
        
        }
      }

  // method encryptBlock(): extracts encrypted message (cipher) from letterBlock in column major order
  // PRECONDITION: letterBlock has been filled
  // @return encrypted String from letterBlock

  private String encryptBlock() {
    String encripted = "";
    for( int row = 0; row < letterBlock[0].length; row ++){
      for(int col = 0; col < letterBlock.length; col ++){
        encripted += letterBlock[col][row];
      }
    }  
        return encripted;
  }

  // method encryptMessage(): encrypts a message using methods fillBlock() and encryptBlock()
  // @param message: the String to be encrypted
  // @return the encrypted message
  // if message is an empty String, returns an empty string

  public String encryptMessage(String message) {
    String fin = "";
    while(message.length() > 0){
      if(message.length() > numCols * numRows){
        fillBlock(message.substring(0, numRows * numCols));
        fin += encryptBlock();
        message = message.substring(numRows * numCols, message.length());
      }
      else{
        fillBlock(message.substring(0, message.length()));
        fin += encryptBlock();
        message = "";
      }
    }
    
    return fin;
  }
}
