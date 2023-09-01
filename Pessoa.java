public class Pessoa
  {
  String Nome;
  int Idade;
  Cao Pet;

    public void pedirPraCaoLatir()
    {
      System.out.println(Nome+" está pedindo para "+Pet.Nome+" latir!\n");
      Pet.Latir();
    }
  }
