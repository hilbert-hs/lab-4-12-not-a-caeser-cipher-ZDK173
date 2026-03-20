class Cipher {
  private String[][] leterBlock;
  private int numRows;
  private int numCols;

  // Constructor: parameters include number of rows, number of columns

  public Cipher(int r, int c) {

  }

  // method fillBlock(): places a String into letterBlock in row major order
  // @param str: the String to be processed
  // POSTCONDITION: if str.length() < numRows * numCols, "A" is placed in each unfilled cell
  // POSTCONDITION: if str.length() > numRows * numCols, trailing characters are ignored

  private void fillBlock(String str) {

  }

  // method encryptBlock(): extracts encrypted message (cipher) from letterBlock in column major order
  // PRECONDITION: letterBlock has been filled
  // @return encrypted String from letterBlock

  private String encryptBlock() {
    return "";
  }

  // method encryptMessage(): encrypts a message using methods fillBlock() and encryptBlock()
  // @param message: the String to be encrypted
  // @return the encrypted message
  // if message is an empty String, returns an empty string

  public String encryptMessage(String message) {
    return "";
  }
}
