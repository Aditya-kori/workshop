public class PlantsDetails{
	public static void main(String[] args){

		Plants plant1 = new Plants();
		plant1.yallu();
		plant1.name = "Mango tree";
		plant1.fruitTaste = "Sweet";
		plant1.seedType = "Monocotilidon";
		plant1.ageInYears = 20;
		plant1.popularity = "Very Popular";
		plant1.yallu();

		Plants plant2 = new Plants();
		plant2.name = "Neem tree";
		plant2.fruitTaste = "Bitter";
		plant2.seedType = "Monocotilidon";
		plant2.ageInYears = 45;
		plant2.popularity = "Less Popular";

		Plants plant3 = new Plants();
		plant3.name = "Cheery tree";
		plant3.fruitTaste = "Sour";
		plant3.seedType = "Monocotilidon";
		plant3.ageInYears = 34;
		plant3.popularity = "Popular were available";

		System.out.println(plant1);
		
		System.out.println(plant1.name);
		System.out.println("+++++++++++++++++++++++++++++");
		System.out.println(plant2);
		System.out.println(plant3);
		System.out.println(plant1.fruitTaste);
		System.out.println(plant1.seedType);
		System.out.println(plant1.ageInYears);
		System.out.println(plant1.popularity);

		System.out.println(plant2.name);
		System.out.println(plant2.fruitTaste);
		System.out.println(plant2.seedType);
		System.out.println(plant2.ageInYears);
		System.out.println(plant2.popularity);
		
		System.out.println(plant3.name);
		System.out.println(plant3.fruitTaste);
		System.out.println(plant3.seedType);
		System.out.println(plant3.ageInYears);
		System.out.println(plant3.popularity);
		

	}
}