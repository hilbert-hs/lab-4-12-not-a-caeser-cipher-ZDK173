class main {
  public static void main(String[] args) {

  // write code here to test your Cipher class.
  // when you're finished, replace your test code with
  // the tests I provided
  System.out.println();
Cipher cipher1 = new Cipher(2, 5);
System.out.println(cipher1.encryptMessage("Highschool"));

System.out.println();

Cipher cipher2 = new Cipher(5, 4);
System.out.println(cipher2.encryptMessage("Hilbert will win at state robotics."));

System.out.println();

Cipher cipher3 = new Cipher(3, 4);
System.out.println(cipher3.encryptMessage("Highschool"));

System.out.println();
System.out.println("Ha - take that you cheater!");


  }
}
