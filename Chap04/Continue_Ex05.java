package Chap04;
public class Continue_Ex05 {
	public static void main(String[] args) {

		//1. ���� �������� continue 
		
		for ( int i =0 ; i < 10 ; i++) {
			continue;
			// System.out.println("��� ���� ���� ");
		}
		
		for ( int i = 0 ; i < 10 ; i++) {
			System.out.print(i + " ");
			continue;				// continue�� ���� ���� ������ ���๮�� ����ϸ� ����
			//System.out.println();
		}
		System.out.println();
		System.out.println("====<<continue>>==========");
		
		//2. ������ ����ؼ� continue ó�� 
		for ( int i = 0 ; i < 10 ; i++) {
			if ( i == 5) {
				continue;
			}
			System.out.print( i + " ");
		}
		
		System.out.println();
		System.out.println("=====<<break>>=========");
		
		
		//2. ������ ����ؼ� break ó��
		
		for ( int i = 0 ; i < 10 ; i++) {
			if ( i == 5) {
				break;
			}
			System.out.print( i + " ");
		}
		
		System.out.println();
		System.out.println("=====<<���߷��� ���� continue>>=========");
		
		//3. ���� ���������� continue ��� 
		for ( int i=0 ; i < 5 ; i++) {
			for ( int j = 0 ; j <5 ; j++) {
				if ( j == 3) {
					continue ;
				}
				System.out.println( i + " , " + j );
			}
		}
		System.out.println();
		System.out.println("=====<<���߷��� ���� break>>=========");
			
		//3. ���� ���������� break��� 
		for ( int i=0 ; i < 5 ; i++) {
			for ( int j = 0 ; j <5 ; j++) {
				if ( j == 3) {
					break ;
				}
				System.out.println( i + " , " + j );
			}
		}
		
		// 4. continue ���� �� ���  
		
		System.out.println();
		System.out.println("=====<<continue ���� �� ���>>=========");
		
POS2:	for ( int i = 0 ; i < 5; i++) {
			for ( int j = 0 ; j < 5 ; j++) {
				if ( j==3 ) {
					continue POS2;
				}				
				System.out.println( i + " , " + j );
			}
		}	

// 4. break ���� �� ���  

			System.out.println();
			System.out.println("=====<<break ���� �� ���>>=========");

POS3:	for ( int i = 0 ; i < 5; i++) {
			for ( int j = 0 ; j < 5 ; j++) {
				if ( j==3 ) {
					break POS3;
				}				
				System.out.println( i + " , " + j );
			}
		}		
		
		
		
		
	}

}