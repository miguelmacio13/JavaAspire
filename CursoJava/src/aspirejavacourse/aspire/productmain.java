package aspirejavacourse.aspire;

public class productmain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		// Inicializar el objeto(s)
		product product = new product();
		
		product product2 = new product("iPhone",16780.99f,987654,"Electrónicos");
		
		
		
		//Utilizar métodos del objeto product
		product.setName("gansito");
		product.setPrice(23);
		product.setSN(123456);
		product.setDepartment("snacks");
		
		System.out.println("El producto es: " + product.getName());
		System.out.println("El precio es: $ " + product.getPrice());
		System.out.println("El número de serie del producto es: " + product.getSN());
		System.out.println("El producto pertenece a este departamento: " + product.getDepartment());
		
		System.out.println("El producto es: " + product2.getName());
		System.out.println("El precio es: $ " + product2.getPrice());
		System.out.println("El número de serie del producto es: " + product2.getSN());
		System.out.println("El producto pertenece a este departamento: " + product2.getDepartment());
		
	}

}
