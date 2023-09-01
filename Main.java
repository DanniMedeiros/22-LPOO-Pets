class Main {
  public static void main(String[] args) 
  {
  Cao cao1 = new Cao();//isso aqui é um objetoo!!!!!
    cao1.Nome = "Demolidor";
    cao1.Pet = "\n Pintcher";
    cao1.somLatido = "\n au au au rrrgggrrrrrgrggrgggrgggrrrrrrrrrrrrrrrr \n";
  Cao cao2 = new Cao();
    cao2.Nome = "Fafá";
    cao2.Pet = "\n Dogue Alemão";
    cao2.somLatido = "\n rooof rooof rooof \n";

  Cao cao3 = new Cao();
    cao3.Nome = "Luna";
    cao3.Pet = "\n NRD";
    cao3.somLatido = "\n au \n";
  Cao cao4 = new Cao();
    cao4.Nome = "Kiara";
    cao4.Pet = "\n Labrador";
    cao4.somLatido = "\n au au au \n";

  Pessoa pessoa1 = new Pessoa();
    pessoa1.Nome = "Joao";
    pessoa1.Idade = 50;
    pessoa1.Pet = cao2;
    pessoa1.pedirPraCaoLatir();

   Pessoa pessoa2 = new Pessoa();
    pessoa2.Nome = "Sabrino";
    pessoa2.Idade = 35;
    pessoa2.Pet = cao1;
    pessoa2.pedirPraCaoLatir();
    
  Pessoa pessoa3 = new Pessoa();
    pessoa3.Nome="Cleber";
    pessoa3.Idade = 21;
    pessoa3.Pet = cao4;    
    pessoa3.Pet.Latir();

  Pessoa pessoa4 = new Pessoa();
    pessoa4.Nome="Diogenes";
    pessoa4.Idade = 39;
    pessoa4.Pet = cao3;    
    pessoa4.Pet.Latir();
  }
}


