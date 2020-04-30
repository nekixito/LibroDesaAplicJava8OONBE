public class ProgramaPrincipal{
	public static void main(String[] args){
		Promedio objPromedio = new Promedio();

		objPromedio.setAlumno("Angela Torres");
		objPromedio.setN1(7);
		objPromedio.setN1(8);

		System.out.println("Nombre alumn@: " + objPromedio.getAlumno());
		System.out.println("Promedio alumn@: " + objPromedio.calculaPromedio());
		System.out.println("Condicion alumn@: " + objPromedio.determinaCondicion());


	}
}