package Pokemon;

public class Pokemon
{
    public String nome;
    public int vida;
    public int ataque;
    public int armadura;

    public Pokemon(String nome, int vida, int ataque, int armadura)
    {
        this.nome = nome;
        this.vida = vida;
        this.ataque = ataque;
        this.armadura = armadura;
    }

    public void Atacar(int vidaTotal)
    {
        vida =  vidaTotal - ataque;
    }
}
