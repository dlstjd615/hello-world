/*
주차장 관리 프로그램

**************
   1. 입차
   2. 출차
   3. 리스트
   4. 종료
**************
  메뉴 : 8
1 ~ 4까지만 번호를 입력하세요

**************
   1. 입차
   2. 출차
   3. 리스트
   4. 종료
**************
  메뉴 : 

1번인 경우
위치 입력 : 3
3위치에 입차 / 이미 주차되어있습니다

2번인 경우
위치 입력 : 4
4위치에 출차 / 주차되어 있지않습니다

3번인 경우
1위치 : true
2위치 : false
3위치 : true
4위치 : false
5위치 : false
*/
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
class ArrayTest4 
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader (System.in));
		boolean[] car = new boolean[5];
		int input=0;
		int in=0;
		int out=0;

			while(input!=4){
					do{
					System.out.println("**************");
					System.out.println("   1. 입차");
					System.out.println("   2. 출차");
					System.out.println("   3. 리스트");
					System.out.println("   4. 종료");
					System.out.println("**************");
					System.out.print("  메뉴 : ");
					input=Integer.parseInt(br.readLine());
						if((input!=1)&&(input!=2)&&(input!=3)&&(input!=4))
								System.out.println("1 ~ 4까지만 번호를 입력하세요");		
					}while((input!=1)&&(input!=2)&&(input!=3)&&(input!=4));


					if(input==3){
						for(int i=0;i<5;i++)
						{
							System.out.println((i+1)+"위치 : "+car[i]);
						}
					}
					else if(input==1){
							System.out.print("위치입력 : ");
							in=Integer.parseInt(br.readLine());

							if(car[(in-1)]) System.out.println("이미 주차되어있습니다");//if(car[(in-1)]==true)이따구로 쓰면 프로그래머들이 무시한다
																									//if(car[(in-1)])이렇게만 써줘도 잘 동작한다
								else {
									System.out.println(in+"위치에 입차 ");
									car[(in-1)]=true;
								}
					}
					else if(input==2){
						System.out.print("위치입력 : ");
						out=Integer.parseInt(br.readLine());

						if(car[(out-1)]){//if(car[(out-1)]==true)이따구로 쓰면 프로그래머들이 무시한다 되긴함
							System.out.println(out+"위치에 출차");
							car[(out-1)]=false;
						}
						else 	System.out.println("주차되어 있지않습니다");

					}
			}System.out.println("프로그램을 종료합니다");
	}
}