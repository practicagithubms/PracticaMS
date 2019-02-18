package entornos;
import java.util.*;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int opc;
		
		Vector <Coches> coches=new Vector();
		
		Scanner sc=new Scanner(System.in);
		
		do {
			System.out.println("barra menu");
			opc=sc.nextInt();
			switch(opc) {
			
			case 1:
				sc.nextLine();
				System.out.println("anota matricula");
				String matricula=sc.nextLine();
				coches.add(new Coches(matricula));
				break;
				
			case 2:
				if(coches.size()>0) {
					Coches salir=coches.remove(0);
					System.out.println(salir);
				}
				else
					System.out.println("no hay coches en la cola");
				break;
				
			case 3:
				System.out.println(coches.toString());
			break;
			
			case 4:
				sc.nextLine();
				System.out.println("anota matricula");
				matricula=sc.nextLine();
				coches.indexOf(new Coches(matricula));//indexof solo busca un objeto busca de uno en uno
				/*int pos=Buscar(coches, matricula);//--------primer ejemplo es lo mismo
				if(pos==-1)
					System.out.println("no encontrado");------
				else
					System.out.println("encontrado en posicion"+pos);
				*/
				break;
			case 5:
				sc.nextLine();
				System.out.println("anota matricula");
				matricula=sc.nextLine();
				if(coches.remove(new Coches(matricula))==true)
					System.out.println("coche borrado");
				else
					System.out.println("no existe el coche");
				break;
				default: System.out.println("opcion incorrecta");
			}
		}while(opc!=6);
	}
	
	public static int Buscar(Vector <Coches> coches, String mat) {
		for(int i=0; i<coches.size(); i++)
			if(coches.get(i).getMatricula().equalsIgnoreCase(mat)) {
				return i;
			}
		return -1;
	}

}
