# Not a Caesar Cipher Test Data

Copy & paste the following into your `Main` method:

System.out.println();
Cipher cipher1 = new Cipher(4, 5);
System.out.println(cipher1.encryptMessage("Redbirds"));

System.out.println();

Cipher cipher2 = new Cipher(4, 2);
System.out.println(cipher2.encryptMessage("Redbirds"));

System.out.println();

Cipher cipher3 = new Cipher(6, 2);
System.out.println(cipher3.encryptMessage("We sing to thee De Pere, our school, our alma mater."));

System.out.println();
System.out.println("Ha - take that you cheater!");
