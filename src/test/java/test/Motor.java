package test;
public class Motor {
	int numeroCilindros;
	String tipo;
	int registro;

	void cambiarRegistro(int r)
	{
		this.registro = r;
	}

	void asignarTipo(String tipo)
	{
		if(tipo == "electrico" || tipo == "gasolina")
		  {
			this.tipo = tipo;
		  }
	}

}
