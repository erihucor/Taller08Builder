package emsamablajecomputadoras.creacional;

public class ConstructorAsusROGE extends ConstructorComputadora {

	@Override
	public void darMarca() {
		// TODO Auto-generated method stub
		computador.setMarca("Asus");
		
	}

	@Override
	public void darModelo() {
		// TODO Auto-generated method stub
		computador.setModelo("ROG");
	}

	@Override
	public void darRam() {
		// TODO Auto-generated method stub
		computador.setRam(32);
	}

	@Override
	public void darAlmacenamiento() {
		// TODO Auto-generated method stub
		computador.setAlmacenamiento(1000);
		
	}

	@Override
	public void darSistemaOperativo() {
		// TODO Auto-generated method stub
		computador.setOs(new SistemaOperativo("Windows",10,"PRO"));
		
	}

	@Override
	public void darMainboard() {
		// TODO Auto-generated method stub
		computador.setPlaca(new Mainboard("Strix ","x99"));
		
	}
	
}
