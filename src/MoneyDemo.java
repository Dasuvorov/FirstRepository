

  enum Money {
		CHIRIK, POLTOS, SOTYGA, PYATIFON, IIITYKAPUK, PYAT_TYSH 
  
  }
  
  
  public class MoneyDemo {
			Money money;
		MoneyDemo(Money money){
			this.money = money;
		}
				public void babosy(){
					
				
			System.out.println("With city is depicted on money");
				switch(money){
					
					case CHIRIK: System.out.println("CHIRIK = Krasnoyarsk ");
					break;
					case POLTOS: System.out.println("POLTOS = Sank-Petersburg");
					break;
					case SOTYGA: System.out.println("SOTYGA = Moscow");
					break;
					case PYATIFON: System.out.println("PYATIFON = Arxangelsk");
					break;	
					case IIITYKAPUK: System.out.println("IIITYKAPUK = Yaroslavl");
					break;
					case PYAT_TYSH: System.out.println("PYAT_TYSH = Habarovsk");
					
				}
			
			
				}	



      public static void main(String[] args) {
			MoneyDemo md = new MoneyDemo(Money.IIITYKAPUK);
			md.babosy();
          }


      }
  