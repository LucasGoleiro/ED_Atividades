package atividade_2_2;

import javax.swing.JOptionPane;

public class Lista {                  
	private int dados[];                  
	private int tamanho;                 

	public Lista(){                       
		dados=new int [5];                    
		tamanho=0;  
	
	}

	public void AdicionaFinal(int e){     

		if (tamanho<dados.length){
			dados[tamanho]=e;                     
			tamanho++;                            
		}
		else{
			System.out.println("Lista Cheia");    
		}
	}

	public int AdicionaInicio(int e, int i){ 
		//i = dados.length - 1;
		if (tamanho<dados.length){
			
			if (dados[0] == 0) {
				dados[0] = e;
				tamanho++;
				return e;
			}
			
			dados[i] = dados[i-1];
			dados[i-1] = 0;
			return AdicionaInicio(e, i-1);
                           
		}
		else{
			System.out.println("Erro, lista cheia");   
			return 0;
		}
	}

	public void  AdicionaQualquerPosicao(int e, int pos){
		int i;
		if ((tamanho<dados.length)&&(pos<tamanho+1)&&(pos>=0)){


			for (i=tamanho;i!=pos;i--){                     
				if (i!=0){                                      
					dados[i]=dados[i-1];                            
				}
			}
			dados[i]=e;                                     
			tamanho++;                                      
		}
	}

	public int RemoveFinal(){
		int retorno = 0;
		int i;
		if (tamanho>=1){                               
			retorno=dados[tamanho-1];
			for (i=0;i<tamanho;i++){                       
				if (i==tamanho-1)                             
					tamanho--;                                    
			}
		}
		return retorno;
	}

	public int RemoveInicio(){
		int retorno = 0;
		int i;
		if (tamanho>=1){                              
			retorno=dados[0];
			for (i=1;i<tamanho;i++){                      
				dados[i-1]=dados[i];                          
			}
			tamanho--;                                   
		}
		return retorno;
	}

	public int RemoveQualquerPosicao(int pos){
		int i,retorno=0;                                         

		if ((pos<tamanho)&&(pos>=0)&&(tamanho>=1)){
			retorno=dados[pos];

			for (i=pos;i<tamanho-1;i++){                 
				dados[i]=dados[i+1];                         
			}

			tamanho--;                                   
		}
		return retorno;
	}



	public void percorre(String aux, int i){                    

		if (i == dados.length) {
			JOptionPane.showMessageDialog(null,"Lista:"+ aux);
		} else {
			if (dados[i] != 0) {
				aux=aux+"\n"+dados[i] + " °C";
				percorre(aux, i + 1);
			} else {
				percorre(aux, i + 1);
			}
	
		}
		
	}
}


