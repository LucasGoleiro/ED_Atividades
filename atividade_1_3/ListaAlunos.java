package atividade_1_3;

import javax.swing.JOptionPane;

public class ListaAlunos {
	
	private No inicio;

	public ListaAlunos(){
		inicio=null;
	}

	public void AdicionaFinal(Aluno aluno) {
		if (inicio==null) {
			
			No n = new No(aluno);
			inicio=n;
		}
		else {
			
			No aux = inicio;
			while(aux.prox!=null){
				aux=aux.prox;
			}
			
			No n=new No(aluno);
			aux.prox=n;
		}
	}

	public void AdicionaInicio(Aluno aluno) {
		No n = new No(aluno);
		n.prox = inicio;
		inicio = n;
	}

	public Aluno RemoveFinal(){
		Aluno r = null;
		if (inicio==null) {
			
			System.out.println("Lista Vázia");
		}
		else {
			
			if (inicio.prox==null) {
				
				r = inicio.aluno;
				inicio = null;
			}
			else {
				
				No aux1 = inicio;
				No aux2 = inicio;

				while(aux1.prox != null) {
					
					aux2 = aux1;
					aux1 = aux1.prox;
				}

				r = aux1.aluno;
				aux2.prox = null;
			}
		}
		return r;
	}
	
	   public void escolhePosicao(Aluno aluno, int pos){
	        No Novo= new No(aluno);

	        if(pos == 1) {           
	            AdicionaInicio(aluno);
	        }else{       
	            No aux=inicio;
	            int count=1;
	            
	            while(aux.prox!=null && count<pos-1){
	                aux=aux.prox;
	                count++;
	            }
	            
	            if(count == pos-1) {  
	                Novo.prox=aux.prox;
	                aux.prox=Novo;
	            }else{
	                System.out.println("Posição Inválida!");
	            }            
	        }
	    }
	   
	   
	    public Aluno escolheRemove(int pos) {
	        Aluno e = null;
	        int i=1;
	        No aux=inicio;
	        	        
	        if(inicio==null){
	            System.out.println("Lista Vazia!");
	            return e;
	        }    
	        if(pos==1){
	            e = RemoveInicio();
	            return e;
	        }else{           
	            while(aux.prox!=null){
	                aux=aux.prox;
	                i++;
	            }
	            if(pos>i || pos==0){
	                System.out.println("Posição Invalida!");
	                return e;
	            }else if(pos==i){
	                e=RemoveFinal();
	                return e;
	            }else{
	                aux=inicio;
	                No aux2=aux;
	                
	                while(pos>1){
	                    aux2=aux;
	                    aux=aux.prox;
	                    pos--;
	                }
	                e=aux.aluno;
	                aux2.prox=aux.prox;
	                return e;
	            }
	        }        
	    }
	 

	public Aluno RemoveInicio() {
		Aluno r = null;
		if (inicio==null){
			JOptionPane.showMessageDialog(null,"Lista Vázia");
		}
		else{
			r=inicio.aluno;
			inicio=inicio.prox;
		}
		return r;
	}

	public String percorre(){
		No aux=inicio;
		String r=" ";
		while(aux!=null){
			r=r+"\n"+aux.aluno.getNome();
			aux=aux.prox;
		}
		return r;
	}

}
