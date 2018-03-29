import java.util.Scanner;
public class ShoppingAdda 
{
	private static double rechargeAmount;
	private static double purchaseAmount;
	private static double totalAmount;
	static Scanner scn=new Scanner(System.in);
	public static void main(String[] args)
	{
		System.out.println("\t###########################################################");
		System.out.println("\t##  W E L C O M E   T O  S H O P P I N G A D D A. C O M  ##");
		System.out.println("\t###########################################################");
		System.out.println();
		rechargeCard();
		
	}
	
	
	//Welcome and Recharge Card 
	private static void rechargeCard()
	{
		System.out.println("Please Recharge Your Card !!");
		System.out.println();
		typeBalance();
	}
	private static void typeBalance()
	{
		System.out.println("Enter Recharge Amount:");
		rechargeAmount=scn.nextDouble();
		System.out.println("Are You Sure?");
		System.out.println("1. Yes");
		System.out.println("2. No");
		System.out.println("3. Exit");
		System.out.println("Enter Your Choice:");
		int choice=scn.nextInt();
		switch(choice)
		{
			case 1: shopByCategories();
					break;
			case 2: typeBalance();
					typeBalance();
			case 3: System.out.println("T H A N K S  F O R  C H O O S I N G  U S ");
					System.exit(0);
			default: System.out.println("Invalid Choice");
						System.out.println();
						typeBalance();
					System.out.println();
		}
	}
	
	// Shopping By Categories
	
	private static void shopByCategories()
	{
		System.out.println();
		System.out.println("Shop By Categories");
		System.out.println("___________________");
		System.out.println("\t1. ELECTRONICS");
		System.out.println("\t2. CLOTHINGS");
		System.out.println("\t3. SPORTS");
		System.out.println("\t4. EXIT");
		System.out.println("Enter Your Choice:");
		int choice=scn.nextInt();
		switch(choice)
		{
			case 1: electronicsDepartment();
					break;
			case 2: clothingDepartment();
					break;
			case 3: sportsDepartment();
					break;
			case 4: calculateBill();
			default: System.out.println("Invalid Choice");
					shopByCategories();
		}
	}
	
	//1. Electronics Department
	
	private static void electronicsDepartment()
	{
		System.out.println("Welcome to Electronics Department");
		System.out.println("_________________________________");
		System.out.println("\t1. MOBILE");
		System.out.println("\t2. TV");
		System.out.println("\t3. REFRIGERATOR");
		System.out.println("\t4. COMPUTER ACCESSORIES");
		System.out.println("\t5. Back to Previous Content");
		System.out.println("Enter Your Choice:");
		int choice=scn.nextInt();
		switch(choice)
		{
			case 1: mobile();
					break;
			case 2: tv();
					break;
			case 3: refrigerator();
					break;
			case 4: computerAccessories();
					break;
			case 5: shopByCategories();
			default:System.out.println("Invalid Choice!!"); 
					electronicsDepartment();
		}
	}
	
		// Mobile
	private static void mobile()
	{
		System.out.println("Welcome to Mobile Section");
		System.out.println("_________________________________");
		System.out.println("\t1. iPhone- Rs 83000/-");
		System.out.println("\t2. OnePlus- Rs 31000/-");
		System.out.println("\t3. Oppo- Rs 22000/-");
		System.out.println("\t4. Vivo- Rs 19000/-");
		System.out.println("\t5. Xiaomi- Rs 15000/-");
		System.out.println("\t6. Back to Previous Content");
		System.out.println("Enter Your Choice:");
		int choice=scn.nextInt();
		switch(choice)
		{
			case 1: iPhone();
					break;
			case 2: onePlus();
					break;
			case 3: oppo();
					break;
			case 4: vivo();
					break;
			case 5: xiaomi();
					break;
			case 6: electronicsDepartment();
			default: System.out.println("Invalid choice!!");
					mobile();
		}
	}
	
		//iphone
	private static void iPhone()
	{
		System.out.println("\t1. Buy");
		System.out.println("\t2. Back");
		System.out.println("Enter Your Choice:");
		int choice=scn.nextInt();
		int quantity;
		switch(choice)
		{
			case 1: System.out.println("Enter Quantity:");
					quantity=scn.nextInt();
					purchaseAmount+=(quantity*83000);
			case 2: mobile();
			default: System.out.println("Invalid choice!!");
					iPhone();
		}
	}
		//oneplus
	private static void onePlus()
	{
		System.out.println("\t1. Buy");
		System.out.println("\t2. Back");
		System.out.println("Enter Your Choice:");
		int choice=scn.nextInt();
		int quantity;
		switch(choice)
		{
			case 1: System.out.println("Enter Quantity:");
					quantity=scn.nextInt();
					purchaseAmount+=(quantity*31000);
			case 2: mobile();
			default: System.out.println("Invalid choice!!");
					onePlus();
		}
	}
		//oppo
	private static void oppo()
	{
		System.out.println("\t1. Buy");
		System.out.println("\t2. Back");
		System.out.println("Enter Your Choice:");
		int choice=scn.nextInt();
		int quantity;
		switch(choice)
		{
			case 1: System.out.println("Enter Quantity:");
					quantity=scn.nextInt();
					purchaseAmount+=(quantity*22000);
			case 2: mobile();
			default: System.out.println("Invalid choice!!");
					oppo();
		}
	}
		//vivo
	private static void vivo()
	{
		System.out.println("\t1. Buy");
		System.out.println("\t2. Back");
		System.out.println("Enter Your Choice:");
		int choice=scn.nextInt();
		int quantity;
		switch(choice)
		{
			case 1: System.out.println("Enter Quantity:");
					quantity=scn.nextInt();
					purchaseAmount+=(quantity*19000);
			case 2: mobile();
			default: System.out.println("Invalid Choice");
					vivo();
		}
	}
		//xiaomi
	private static void xiaomi()
	{
		System.out.println("\t1. Buy");
		System.out.println("\t2. Back");
		System.out.println("Enter Your Choice:");
		int choice=scn.nextInt();
		int quantity;
		switch(choice)
		{
			case 1: System.out.println("Enter Quantity:");
					quantity=scn.nextInt();
					purchaseAmount+=(quantity*15000);
			case 2: mobile();
			default: System.out.println("Invalid choice!!");
					xiaomi();
		}
	}
		//Tv
	
	private static void tv()
	{
		System.out.println("Welcome to Television Section");
		System.out.println("_________________________________");
		System.out.println("\t1. Sony Bravia- Rs 149999/-");
		System.out.println("\t2. Samsung Tv- Rs 81000/-");
		System.out.println("\t3. LG Tv- Rs 51000/-");
		System.out.println("\t4. Sanyo- Rs 25000/-");
		System.out.println("\t5. Back to Previous Content");
		System.out.println("Enter Your Choice:");
		int choice=scn.nextInt();
		switch(choice)
		{
			case 1: sonyBravia();
					break;
			case 2: samsungTv();
					break;
			case 3: lgTv();
					break;
			case 4: sanyo();
					break;
			case 5: electronicsDepartment();
			default: System.out.println("Invalid choice!!");
					tv();
		}
	}
		//SonyBravia
	private static void sonyBravia()
	{
		System.out.println("\t1. Buy");
		System.out.println("\t2. Back");
		System.out.println("Enter Your Choice:");
		int choice=scn.nextInt();
		int quantity;
		switch(choice)
		{
			case 1: System.out.println("Enter Quantity:");
					quantity=scn.nextInt();
					purchaseAmount+=(quantity*149999);
			case 2: tv();
			default: System.out.println("Invalid choice!!");
					sonyBravia();
		}
	}
	
		//samsung tv
	private static void samsungTv()
	{
		System.out.println("\t1. Buy");
		System.out.println("\t2. Back");
		System.out.println("Enter Your Choice:");
		int choice=scn.nextInt();
		int quantity;
		switch(choice)
		{
			case 1: System.out.println("Enter Quantity:");
					quantity=scn.nextInt();
					purchaseAmount+=(quantity*81000);
			case 2: tv();
			default: System.out.println("Invalid choice!!");
					samsungTv();
		}
	}
	
		//LG Tv
	private static void lgTv()
	{
		System.out.println("\t1. Buy");
		System.out.println("\t2. Back");
		System.out.println("Enter Your Choice:");
		int choice=scn.nextInt();
		int quantity;
		switch(choice)
		{
			case 1: System.out.println("Enter Quantity:");
					quantity=scn.nextInt();
					purchaseAmount+=(quantity*51000);
			case 2: tv();
			default: System.out.println("Invalid choice!!");
					lgTv();
		}
	}
	
		//sanyotv
	private static void sanyo()
	{
		System.out.println("\t1. Buy");
		System.out.println("\t2. Back");
		System.out.println("Enter Your Choice:");
		int choice=scn.nextInt();
		int quantity;
		switch(choice)
		{
			case 1: System.out.println("Enter Quantity:");
					quantity=scn.nextInt();
					purchaseAmount+=(quantity*25000);
			case 2: tv();
			default: System.out.println("Invalid choice!!");
					sanyo();
		}
	}
	
		//Refrigerator
	
	private static void refrigerator()
	{
		System.out.println("Welcome to Refrigeration Section");
		System.out.println("_________________________________");
		System.out.println("\t1. LG- Rs 29000/-");
		System.out.println("\t2. Haier- Rs 24999/-");
		System.out.println("\t3. Whirlpool- Rs 17990");
		System.out.println("\t4. Godrej- Rs 12700/-");
		System.out.println("\t5. Back to Previous Content");
		System.out.println("Enter Your Choice:");
		int choice=scn.nextInt();
		switch(choice)
		{
			case 1: lg();
					break;
			case 2: haier();
					break;
			case 3:	whirlpool();
					break;
			case 4: godrej();
					break;
			case 5:  electronicsDepartment();
			default: System.out.println("Invalid Choice!!");
					refrigerator();
		}
	}
	
		//lg refrigerator
	
	private static void lg()
	{
		System.out.println("\t1. Buy");
		System.out.println("\t2. Back");
		System.out.println("Enter Your Choice:");
		int choice=scn.nextInt();
		int quantity;
		switch(choice)
		{
			case 1: System.out.println("Enter Quantity:");
					quantity=scn.nextInt();
					purchaseAmount+=(quantity*29000);
			case 2: refrigerator();
			default: System.out.println("Invalid choice!!");
					lg();
		}
	}
	
		//haier
	private static void haier()
	{
		System.out.println("\t1. Buy");
		System.out.println("\t2. Back");
		System.out.println("Enter Your Choice:");
		int choice=scn.nextInt();
		int quantity;
		switch(choice)
		{
			case 1: System.out.println("Enter Quantity:");
					quantity=scn.nextInt();
					purchaseAmount+=(quantity*24999);
			case 2: refrigerator();
			default: System.out.println("Invalid choice!!");
					haier();
		}
	}
	
		//whirlpool
	
	private static void whirlpool()
	{
		System.out.println("\t1. Buy");
		System.out.println("\t2. Back");
		System.out.println("Enter Your Choice:");
		int choice=scn.nextInt();
		int quantity;
		switch(choice)
		{
			case 1: System.out.println("Enter Quantity:");
					quantity=scn.nextInt();
					purchaseAmount+=(quantity*17990);
			case 2: refrigerator();
			default: System.out.println("Invalid choice!!");
					whirlpool();
		}
	}
	
		//godrej
	
	private static void godrej()
	{
		System.out.println("\t1. Buy");
		System.out.println("\t2. Back");
		System.out.println("Enter Your Choice:");
		int choice=scn.nextInt();
		int quantity;
		switch(choice)
		{
			case 1: System.out.println("Enter Quantity:");
					quantity=scn.nextInt();
					purchaseAmount+=(quantity*12700);
			case 2: refrigerator();
			default: System.out.println("Invalid choice!!");
					godrej();
		}
	}
		//Computer Accessories
	
	private static void computerAccessories()
	{
		System.out.println("Welcome to Computer Acessories");
		System.out.println("_________________________________");
		System.out.println("\t1. Hardisk- Rs 6000/-");
		System.out.println("\t2. Keyboard- Rs 1000/-");
		System.out.println("\t3. Mouse- Rs 700/-");
		System.out.println("\t4. Pendrive- Rs 500/-");
		System.out.println("\t5. Back to Previous Content");
		System.out.println("Enter Your Choice:");
		int choice=scn.nextInt();
		switch(choice)
		{
			case 1:	hardisk();
					break;
			case 2: keyboard();
					break;
			case 3: mouse();
					break;
			case 4: pendrive();
					break;
			case 5: electronicsDepartment();
			default: System.out.println("Invalid Choice!!");
					computerAccessories();
		}
	}
	
		//hardisk
	
	private static void hardisk()
	{
		System.out.println("\t1. Buy");
		System.out.println("\t2. Back");
		System.out.println("Enter Your Choice:");
		int choice=scn.nextInt();
		int quantity;
		switch(choice)
		{
			case 1: System.out.println("Enter Quantity:");
					quantity=scn.nextInt();
					purchaseAmount+=(quantity*6000);
			case 2: computerAccessories();
			default: System.out.println("Invalid choice!!");
					hardisk();
		}
	}
		
		//keyboard
	
	private static void keyboard()
	{
		System.out.println("\t1. Buy");
		System.out.println("\t2. Back");
		System.out.println("Enter Your Choice:");
		int choice=scn.nextInt();
		int quantity;
		switch(choice)
		{
			case 1: System.out.println("Enter Quantity:");
					quantity=scn.nextInt();
					purchaseAmount+=(quantity*1000);
			case 2: computerAccessories();
			default: System.out.println("Invalid choice!!");
					keyboard();
		}
	}
	
		//Mouse
	private static void mouse()
	{
		System.out.println("\t1. Buy");
		System.out.println("\t2. Back");
		System.out.println("Enter Your Choice:");
		int choice=scn.nextInt();
		int quantity;
		switch(choice)
		{
			case 1: System.out.println("Enter Quantity:");
					quantity=scn.nextInt();
					purchaseAmount+=(quantity*700);
			case 2: computerAccessories();
			default: System.out.println("Invalid choice!!");
					mouse();
		}
	}
	
		//pendrive
	
	private static void pendrive()
	{
		System.out.println("\t1. Buy");
		System.out.println("\t2. Back");
		System.out.println("Enter Your Choice:");
		int choice=scn.nextInt();
		int quantity;
		switch(choice)
		{
			case 1: System.out.println("Enter Quantity:");
					quantity=scn.nextInt();
					purchaseAmount+=(quantity*500);
			case 2: computerAccessories();
			default: System.out.println("Invalid choice!!");
					pendrive();
		}
	}
	//2. Clothing Department
	
	private static void clothingDepartment()
	{
		System.out.println("Welcome to Clothing Section");
		System.out.println("____________________________");
		System.out.println("\t1. Men");
		System.out.println("\t2. Women");
		System.out.println("\t3. Kids");
		System.out.println("\t4. Back to Previous Content");
		System.out.println("Enter Your Choice:");
		int choice=scn.nextInt();
		switch(choice)
		{
			case 1: men();
					break;
			case 2: women();
					break;
			case 3: kids();
					break;
			case 4: shopByCategories();
			case 5: System.out.println("Invalid Choice!!");
					clothingDepartment();
		}
	}
	
		//men
	
	private static void men()
	{
		System.out.println("Welcome to Men's Section");
		System.out.println("________________________");
		System.out.println("\t1. Sports Shoes- Rs 4000/-");
		System.out.println("\t2. Jeans- Rs 2000/-");
		System.out.println("\t3. T-Shirts- Rs 1200/-");
		System.out.println("\t4. Track Pants- Rs 900/-");
		System.out.println("\t5. Back to Previous Content");
		System.out.println("Enter Your Choice:");
		int choice=scn.nextInt();
		switch(choice)
		{
			case 1: sportsShoes();
					break;
			case 2: jeans();
					break;
			case 3: tShirts();
					break;
			case 4: trackPants();
					break;
			case 5: clothingDepartment();
			default: System.out.println("Invalid Choice!!");
					men();
		}
	}
	
		//sports shoes
	
	private static void sportsShoes()
	{
		System.out.println("\t1. Buy");
		System.out.println("\t2. Back");
		System.out.println("Enter Your Choice:");
		int choice=scn.nextInt();
		int quantity;
		switch(choice)
		{
			case 1: System.out.println("Enter Quantity:");
					quantity=scn.nextInt();
					purchaseAmount+=(quantity*4000);
			case 2: men();
			default: System.out.println("Invalid choice!!");
					sportsShoes();
		}
	}
	
		//jens
	
	private static void jeans()
	{
		System.out.println("\t1. Buy");
		System.out.println("\t2. Back");
		System.out.println("Enter Your Choice:");
		int choice=scn.nextInt();
		int quantity;
		switch(choice)
		{
			case 1: System.out.println("Enter Quantity:");
					quantity=scn.nextInt();
					purchaseAmount+=(quantity*2000);
			case 2: men();
			default: System.out.println("Invalid choice!!");
					jeans();
		}
	}
	
		// T-Shirts
	
	private static void tShirts()
	{
		System.out.println("\t1. Buy");
		System.out.println("\t2. Back");
		System.out.println("Enter Your Choice:");
		int choice=scn.nextInt();
		int quantity;
		switch(choice)
		{
			case 1: System.out.println("Enter Quantity:");
					quantity=scn.nextInt();
					purchaseAmount+=(quantity*1200);
			case 2: men();
			default: System.out.println("Invalid choice!!");
					tShirts();
		}
	}
	
		//Track Pants
	
	private static void trackPants()
	{
		System.out.println("\t1. Buy");
		System.out.println("\t2. Back");
		System.out.println("Enter Your Choice:");
		int choice=scn.nextInt();
		int quantity;
		switch(choice)
		{
			case 1: System.out.println("Enter Quantity:");
					quantity=scn.nextInt();
					purchaseAmount+=(quantity*900);
			case 2: men();
			default: System.out.println("Invalid choice!!");
					jeans();
		}
	}
	
		//Women
	
	private static void women()
	{
		System.out.println("Welcome to Women's Section");
		System.out.println("________________________");
		System.out.println("\t1. Sarees- Rs 5000/-");
		System.out.println("\t2. Kurtas- Rs 2500/-");
		System.out.println("\t3. Leggings- Rs 1200/-");
		System.out.println("\t4. Sandals- Rs 500/-");
		System.out.println("\t5. Back to Previous Content");
		System.out.println("Enter Your Choice:");
		int choice=scn.nextInt();
		switch(choice)
		{
			case 1: sarees();
					break;
			case 2: kurtas();
					break;
			case 3: leggings();
					break;
			case 4: sandals();
					break;
			case 5: clothingDepartment();
			default: System.out.println("Invalid Choice!!");
					women();
		}
	}
	
		//Sarees
	private static void sarees() 
	{
		System.out.println("\t1. Buy");
		System.out.println("\t2. Back");
		System.out.println("Enter Your Choice:");
		int choice=scn.nextInt();
		int quantity;
		switch(choice)
		{
			case 1: System.out.println("Enter Quantity:");
					quantity=scn.nextInt();
					purchaseAmount+=(quantity*5000);
			case 2: women();
			default: System.out.println("Invalid choice!!");
					sarees();
		}
		
	}
	
		//kurtas
	
	private static void kurtas()
	{
		System.out.println("\t1. Buy");
		System.out.println("\t2. Back");
		System.out.println("Enter Your Choice:");
		int choice=scn.nextInt();
		int quantity;
		switch(choice)
		{
			case 1: System.out.println("Enter Quantity:");
					quantity=scn.nextInt();
					purchaseAmount+=(quantity*2500);
			case 2: women();
			default: System.out.println("Invalid choice!!");
					kurtas();
		}
	}
	
		//leggings
	
	private static void leggings()
	{
		System.out.println("\t1. Buy");
		System.out.println("\t2. Back");
		System.out.println("Enter Your Choice:");
		int choice=scn.nextInt();
		int quantity;
		switch(choice)
		{
			case 1: System.out.println("Enter Quantity:");
					quantity=scn.nextInt();
					purchaseAmount+=(quantity*1200);
			case 2: women();
			default: System.out.println("Invalid choice!!");
					leggings();
		}
	}
	
		//Sandals
	
	private static void sandals()
	{
		System.out.println("\t1. Buy");
		System.out.println("\t2. Back");
		System.out.println("Enter Your Choice:");
		int choice=scn.nextInt();
		int quantity;
		switch(choice)
		{
			case 1: System.out.println("Enter Quantity:");
					quantity=scn.nextInt();
					purchaseAmount+=(quantity*500);
			case 2: women();
			default: System.out.println("Invalid choice!!");
					sandals();
		}
	}
	
		//kids
	
	private static void kids()
	{
		System.out.println("\t1. Shirt- Rs 800/-");
		System.out.println("\t2. Pant- Rs 600/-");
		System.out.println("\t3. Sweater- Rs 500/-");
		System.out.println("\t4. Sandals- Rs 100/-");
		System.out.println("\t5. Back to Previous Content");
		System.out.println("Enter Your Choice:");
		int choice=scn.nextInt();
		switch(choice)
		{
			case 1: shirt();
					break;
			case 2: pant();
					break;
			case 3: sweater();
					break;
			case 4: kidSandal();
					break;
			case 5: clothingDepartment();
			default: System.out.println("Invalid Choice!!");
			 		kids();
		}

	}
	
		//shirt
	
	private static void shirt()
	{
		System.out.println("\t1. Buy");
		System.out.println("\t2. Back");
		System.out.println("Enter Your Choice:");
		int choice=scn.nextInt();
		int quantity;
		switch(choice)
		{
			case 1: System.out.println("Enter Quantity:");
					quantity=scn.nextInt();
					purchaseAmount+=(quantity*800);
			case 2: kids();
			default: System.out.println("Invalid choice!!");
					shirt();
		}
	}
	
		//pant
	
	private static void pant()
	{
		System.out.println("\t1. Buy");
		System.out.println("\t2. Back");
		System.out.println("Enter Your Choice:");
		int choice=scn.nextInt();
		int quantity;
		switch(choice)
		{
			case 1: System.out.println("Enter Quantity:");
					quantity=scn.nextInt();
					purchaseAmount+=(quantity*600);
			case 2: kids();
			default: System.out.println("Invalid choice!!");
					pant();
		}
	}
	
		//sweater
	
	private static void sweater()
	{
		System.out.println("\t1. Buy");
		System.out.println("\t2. Back");
		System.out.println("Enter Your Choice:");
		int choice=scn.nextInt();
		int quantity;
		switch(choice)
		{
			case 1: System.out.println("Enter Quantity:");
					quantity=scn.nextInt();
					purchaseAmount+=(quantity*500);
			case 2: kids();
			default: System.out.println("Invalid choice!!");
					sweater();
		}
	}
	
		//kid sandal
	
	private static void kidSandal()
	{
		System.out.println("\t1. Buy");
		System.out.println("\t2. Back");
		System.out.println("Enter Your Choice:");
		int choice=scn.nextInt();
		int quantity;
		switch(choice)
		{
			case 1: System.out.println("Enter Quantity:");
					quantity=scn.nextInt();
					purchaseAmount+=(quantity*100);
			case 2: kids();
			default: System.out.println("Invalid choice!!");
					kidSandal();
		}
	}
	
	
	//3. Sports Department
	
	private static void sportsDepartment()
	{
		System.out.println("Welcome to Sports Section");
		System.out.println("_________________________");
		System.out.println("\t1. Cricket");
		System.out.println("\t2. Hockey");
		System.out.println("\t3. Badminton");
		System.out.println("\t4. Football");
		System.out.println("\t5. Back to Previous Content");
		System.out.println("Enter Your Choice:");
		int choice=scn.nextInt();
		switch(choice)
		{
			case 1: cricket();
					break;
			case 2: hockey();
					break;
			case 3: badminton();
					break;
			case 4: football();
					break;
			case 5: shopByCategories();
			default: System.out.println("Invalid Choice!!");
					sportsDepartment();
		}
	}
	
		//cricket
	
	private static void cricket()
	{
		System.out.println("\t1. Bat- Rs 1500/-");
		System.out.println("\t2. Stump- Rs 300");
		System.out.println("\t3. Ball- Rs 150");
		System.out.println("\t4. Back to Previous Content");
		System.out.println("Enter Your Choice:");
		int choice=scn.nextInt();
		switch(choice)
		{
			case 1: bat();
					break;
			case 2: stump();
					break;
			case 3: ball();
					break;
			case 4: sportsDepartment();
			default: System.out.println("Invalid Choice!!");
					cricket();
		}
	}
	
		//Bat

	private static void bat()
	{
		System.out.println("\t1. Buy");
		System.out.println("\t2. Back");
		System.out.println("Enter Your Choice:");
		int choice=scn.nextInt();
		int quantity;
		switch(choice)
		{
			case 1: System.out.println("Enter Quantity:");
					quantity=scn.nextInt();
					purchaseAmount+=(quantity*1500);
			case 2: cricket();
			default: System.out.println("Invalid choice!!");
					bat();
		}
	}
	
		//stump
	
	private static void stump()
	{
		System.out.println("\t1. Buy");
		System.out.println("\t2. Back");
		System.out.println("Enter Your Choice:");
		int choice=scn.nextInt();
		int quantity;
		switch(choice)
		{
			case 1: System.out.println("Enter Quantity:");
					quantity=scn.nextInt();
					purchaseAmount+=(quantity*300);
			case 2: cricket();
			default: System.out.println("Invalid choice!!");
					stump();
		}
	}
	
		//Ball
	
	private static void ball()
	{
		System.out.println("\t1. Buy");
		System.out.println("\t2. Back");
		System.out.println("Enter Your Choice:");
		int choice=scn.nextInt();
		int quantity;
		switch(choice)
		{
			case 1: System.out.println("Enter Quantity:");
					quantity=scn.nextInt();
					purchaseAmount+=(quantity*150);
			case 2: cricket();
			default: System.out.println("Invalid choice!!");
					ball();
		}
	}
	
		//Hockey
	
	private static void hockey()
	{
		System.out.println("\t1. Hockey Stick- Rs 2000/-");
		System.out.println("\t2. Ball- Rs 300");
		System.out.println("\t3. Back to Previous Content");
		System.out.println("Enter Your Choice:");
		int choice=scn.nextInt();
		switch(choice)
		{
			case 1: hockeyStick();
					break;
			case 2: hockeyBall();
					break;
			case 3: sportsDepartment();
			default: System.out.println("Invalid Choice!!");
					hockey();
		}
	}
	
		//Hockey Stick
	
	private static void hockeyStick()
	{
		System.out.println("\t1. Buy");
		System.out.println("\t2. Back");
		System.out.println("Enter Your Choice:");
		int choice=scn.nextInt();
		int quantity;
		switch(choice)
		{
			case 1: System.out.println("Enter Quantity:");
					quantity=scn.nextInt();
					purchaseAmount+=(quantity*2000);
			case 2: hockey();
			default: System.out.println("Invalid choice!!");
					hockeyStick();
		}
	}
	
	// Hockey Ball
	
	private static void hockeyBall()
	{
		System.out.println("\t1. Buy");
		System.out.println("\t2. Back");
		System.out.println("Enter Your Choice:");
		int choice=scn.nextInt();
		int quantity;
		switch(choice)
		{
			case 1: System.out.println("Enter Quantity:");
					quantity=scn.nextInt();
					purchaseAmount+=(quantity*300);
			case 2: hockey();
			default: System.out.println("Invalid choice!!");
					hockeyBall();
		}
	}
	
		//Badminton
	
	private static void badminton()
	{
		System.out.println("\t1. Racquet- Rs 500/-");
		System.out.println("\t2. Shuttles- Rs 25/-");
		System.out.println("\t3. Back to Previous Content");
		System.out.println("Enter Your Choice:");
		int choice=scn.nextInt();
		switch(choice)
		{
			case 1: racquet();
					break;
			case 2: shuttles();
					break;
			case 3: sportsDepartment();
			default: System.out.println("Invalid Choice!!");
					badminton();
		}
	}
	
		//Racquet
	
	private static void racquet()
	{
		System.out.println("\t1. Buy");
		System.out.println("\t2. Back");
		System.out.println("Enter Your Choice:");
		int choice=scn.nextInt();
		int quantity;
		switch(choice)
		{
			case 1: System.out.println("Enter Quantity:");
					quantity=scn.nextInt();
					purchaseAmount+=(quantity*500);
			case 2: badminton();
			default: System.out.println("Invalid choice!!");
					racquet();
		}
	}
	
		//shuttles
	
	private static void shuttles()
	{
		System.out.println("\t1. Buy");
		System.out.println("\t2. Back");
		System.out.println("Enter Your Choice:");
		int choice=scn.nextInt();
		int quantity;
		switch(choice)
		{
			case 1: System.out.println("Enter Quantity:");
					quantity=scn.nextInt();
					purchaseAmount+=(quantity*25);
			case 2: badminton();
			default: System.out.println("Invalid choice!!");
					shuttles();
		}
	}
	
		//Football
	
	private static void football()
	{
		System.out.println("\t1. Football- Rs 350/-");
		System.out.println("\t2. Keeper Gloves- Rs 150");
		System.out.println("\t3. Back to Previous Content");
		System.out.println("Enter Your Choice:");
		int choice=scn.nextInt();
		switch(choice)
		{
			case 1: football1();
					break;
			case 2: keeperGloves();
					break;
			case 3: sportsDepartment();
			default: System.out.println("Invalid Choice!!");
					football();
		}
	}
	
		//Football 1
	
	private static void football1()
	{
		System.out.println("\t1. Buy");
		System.out.println("\t2. Back");
		System.out.println("Enter Your Choice:");
		int choice=scn.nextInt();
		int quantity;
		switch(choice)
		{
			case 1: System.out.println("Enter Quantity:");
					quantity=scn.nextInt();
					purchaseAmount+=(quantity*25);
			case 2: sportsDepartment();
			default: System.out.println("Invalid choice!!");
					football1();
		}
	}
	
		//Keeper Gloves
	
	private static void keeperGloves()
	{
		System.out.println("\t1. Buy");
		System.out.println("\t2. Back");
		System.out.println("Enter Your Choice:");
		int choice=scn.nextInt();
		int quantity;
		switch(choice)
		{
			case 1: System.out.println("Enter Quantity:");
					quantity=scn.nextInt();
					purchaseAmount+=(quantity*150);
			case 2: sportsDepartment();
			default: System.out.println("Invalid choice!!");
					keeperGloves();
		}
	}
	// Final Bill Calculation
	
	private static void calculateBill()
	{
		if(purchaseAmount==0)
		{
			System.out.println("T H A N K S  F O R  C H O O S I N G  U S ");
			System.exit(0);
		}
		double cgst=purchaseAmount*0.06;
		double sgst=purchaseAmount*0.06;
		totalAmount=purchaseAmount+sgst+cgst;
		if(totalAmount>rechargeAmount)
		{
			rechargeCard1();
		}
		else
		{
			System.out.println("Purchased Amount="+purchaseAmount);
			System.out.println("SGST 6%="+ sgst);
			
			System.out.println("CGST 6%="+ cgst);
			
			System.out.println("Total Amount="+totalAmount);
			System.out.println("Remaining Card Balance="+(rechargeAmount-totalAmount));
			System.out.println(" T H A N K S  F O R  S H O P P I N G    W I T H   U S ");
			System.exit(0);
		}
		
	//	System.out.println("Sl No\tItem\tQuantity\tPerPiece\tTotal");
	//	System.exit(0);
	}
	private static void rechargeCard1()
	{
		System.out.println("You have not Enough Balance");
		System.out.println("Enter Extra Amount to be Added");
		double extraAmount=scn.nextDouble();
		rechargeAmount+=extraAmount;
		if(rechargeAmount>=totalAmount)
		{
			calculateBill();
		}
		else
		{
			System.out.println("You have short of "+(totalAmount-rechargeAmount)+" Rupees");
			rechargeCard1();
		}
	}
}
