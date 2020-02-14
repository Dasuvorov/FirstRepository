import java.util.Random;
/**
Школа организовала распродажу в пользу стариков. На распродаже
продавались билеты двух видов:
• обычный билет участника распродажи; common
• билет с правом посещения концерта. concert
Тот, кто приобрел более 10 обычных билетов участника, 
получал дополнительно еще один такой же - бесплатно. x > 10 common + 1 common
Напишите класс, который для каждого из 200 участников распродажи   userSallers = 200 ticket  common & concert
 будет принимать в качестве ввода количество билетов каждого вида,
приобретенных данным участником (два положительных целых числа).
Класс подсчитает и напечатает в качестве вывода число
 проданных билетов каждого вида, а также число обычных билетов, выданных бесплатно. 
 countCommon countConcet count freeCountCommon

*/

public class K1314{

	public static void main(String[] args){
		int commonTicket;
		
		Random random = new Random();
		int concertTicket;	
		int countCommonTicket = 0;
		
		int sumComon =0;
		int sumConcert = 0;
		for(int i =1; i<=200; i++){
			
		commonTicket = 1 + random.nextInt(99);
		concertTicket = 1 + random.nextInt(99);			
			sumComon += commonTicket;
			sumConcert += concertTicket;
			System.out.print(commonTicket + " " + concertTicket + " ");
		if(commonTicket > 10){
					countCommonTicket++;
		}
	}
		System.out.println();
		System.out.println("commonTicket " + (sumComon + countCommonTicket));
		System.out.println("concertTicket "  + sumConcert);
	}
}