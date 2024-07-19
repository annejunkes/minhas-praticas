package anne;

import java.util.Scanner;

public class TranscricaoTraducaoDnaRna {
	
	public static void main(String[] args) {
	
	Scanner scan = new Scanner(System.in);
	
	int q=1;
	System.out.println("Digite os codons que serao lidos:");
	String entrada = scan.nextLine();
	while(!entrada.equals("ATT") && !entrada.equals("ATC") && !entrada.equals("ACT")) {
	entrada = scan.nextLine();
	q++;
	}
	
	String[] baseDna = new String[q];
	String[] baseRna = new String[q];

	System.out.println("");
	System.out.println("-Transcricao e traducao de RNA-");
	System.out.println("Digite codons(trincas) de DNA em letras maiusculas:");
	
	//ENTRADA DO DNA

	for(int i=0; i<baseDna.length; i++) {
		baseDna[i] = scan.nextLine();
		if(baseDna[i].equals("ATT") || baseDna[i].equals("ATC") || baseDna[i].equals("ACT")){
			break;
			}	
		}
	
	
	
	//DNA VIRA RNA
	
	        System.out.println("");
			System.out.println("Aminoacidos:");
				
			for(int i=0; i<baseDna.length; i++) {
							
				if(baseDna[i]==null){
					baseRna[i]="null";
				}
				if(baseDna[i].equals("AAA")) {
					baseRna[i]="UUU-Fenilalanina";			
				}
				if(baseDna[i].equals("AAG")) {
					baseRna[i]="UUC-Fenilalanina";			
				}
				if(baseDna[i].equals("AAT")) {
					baseRna[i]="UUA-Leucina";			
				}
				if(baseDna[i].equals("AAC")) {
					baseRna[i]="UUG-Leucina";			
				}
				///////////////////////////////
				if(baseDna[i].equals("AGA")) {
					baseRna[i]="UCU-Serina";			
				}
				if(baseDna[i].equals("AGG")) {
					baseRna[i]="UCC-Serina";			
				}
				if(baseDna[i].equals("AGT")) {
					baseRna[i]="UCA-Serina";			
				}
				if(baseDna[i].equals("AGC")) {
					baseRna[i]="UCG-Serina";			
				}
				////////////////////////////////
				if(baseDna[i].equals("ATA")) {
					baseRna[i]="UAU-Tirosina";			
				}
				if(baseDna[i].equals("ATG")) {
					baseRna[i]="UAC-Tirosina";			
				}
				if(baseDna[i].equals("ATT")) {
					baseRna[i]="UAA-Parada";			
				}
				if(baseDna[i].equals("ATC")) {
					baseRna[i]="UAG-Parada";			
				}
				if(baseDna[i].equals("ACT")) {
					baseRna[i]="UGA-Parada";			
				}
				////////////////////////////////
				if(baseDna[i].equals("ATA")) {
					baseRna[i]="UAU-Tirosina";			
				}
				if(baseDna[i].equals("ATG")) {
					baseRna[i]="UAC-Tirsoina";			
				}
				if(baseDna[i].equals("ATT")) {
					baseRna[i]="UAA-Parada";			
				}
				if(baseDna[i].equals("ATC")) {
					baseRna[i]="UAG-Parada";			
				}
				////////////////////////////////
				if(baseDna[i].equals("ACA")) {
					baseRna[i]="UGU-Cisteína";			
				}
				if(baseDna[i].equals("ACG")) {
					baseRna[i]="UGC-Cisteína";			
				}
				if(baseDna[i].equals("ACC")) {
					baseRna[i]="UGG-Triptofano";			
				}
				////////////////////////////////
				if(baseDna[i].equals("GAA")) {
					baseRna[i]="CUU-Leucina";			
				}
				if(baseDna[i].equals("GAG")) {
					baseRna[i]="CUC-Leucina";			
				}
				if(baseDna[i].equals("GAT")) {
					baseRna[i]="CUA-Leucina";			
				}
				if(baseDna[i].equals("GAC")) {
					baseRna[i]="CUG-Leucina";			
				}
				///////////////////////////////
				if(baseDna[i].equals("GGA")) {
					baseRna[i]="CCU-Prolina";			
				}
				if(baseDna[i].equals("GGG")) {
					baseRna[i]="CCC-Prolina";			
				}
				if(baseDna[i].equals("GGT")) {
					baseRna[i]="CCA-Prolina";			
				}
				if(baseDna[i].equals("GGC")) {
					baseRna[i]="CCG-Prolina";			
				}
				///////////////////////////////
				if(baseDna[i].equals("GTA")) {
					baseRna[i]="CAU-Histidina";			
				}
				if(baseDna[i].equals("GTG")) {
					baseRna[i]="CAC-Histidina";			
				}
				if(baseDna[i].equals("GTT")) {
					baseRna[i]="CAA-Glutamina";			
				}
				if(baseDna[i].equals("GTC")) {
					baseRna[i]="CAG-Glutamina";			
				}
				///////////////////////////////
				if(baseDna[i].equals("GCA")) {
					baseRna[i]="CGU-Arginina";			
				}
				if(baseDna[i].equals("GCG")) {
					baseRna[i]="CGC-Arginina";			
				}
				if(baseDna[i].equals("GCT")) {
					baseRna[i]="CGA-Arginina";			
				}
				if(baseDna[i].equals("GCC")) {
					baseRna[i]="CGG-Arginina";			
				}
				///////////////////////////////
				if(baseDna[i].equals("GCA")) {
					baseRna[i]="CGU-Arginina";			
				}
				if(baseDna[i].equals("GCG")) {
					baseRna[i]="CGC-Arginina";			
				}
				if(baseDna[i].equals("GCT")) {
					baseRna[i]="CGA-Arginina";			
				}
				if(baseDna[i].equals("GCC")) {
					baseRna[i]="CGG-Arginina";			
				}
				///////////////////////////////
				if(baseDna[i].equals("TAA")) {
					baseRna[i]="AUU-Isoleucina";			
				}
				if(baseDna[i].equals("TAG")) {
					baseRna[i]="AUC-Isoleucina";			
				}
				if(baseDna[i].equals("TAT")) {
					baseRna[i]="AUA-Isoleucina";			
				}
				if(baseDna[i].equals("TAC")) {
					baseRna[i]="AUG-Metionina";			
				}
                ///////////////////////////////
				if(baseDna[i].equals("TGA")) {
					baseRna[i]="ACU-Treonina";			
				}
				if(baseDna[i].equals("TGG")) {
					baseRna[i]="ACC-Treonina";			
				}
				if(baseDna[i].equals("TGT")) {
					baseRna[i]="ACA-Treonina";			
				}
				if(baseDna[i].equals("TGC")) {
					baseRna[i]="ACG-Treonina";			
				}
                ///////////////////////////////
				if(baseDna[i].equals("TTA")) {
					baseRna[i]="AAU-Aspargina";			
				}
				if(baseDna[i].equals("TTG")) {
					baseRna[i]="AAC-Aspargina";			
				}
				if(baseDna[i].equals("TTT")) {
					baseRna[i]="AAA-Lisina";			
				}
				if(baseDna[i].equals("TTC")) {
					baseRna[i]="AAG-Lisina";			
				}
                ///////////////////////////////
				if(baseDna[i].equals("TCA")) {
					baseRna[i]="AGU-Serina";			
				}
				if(baseDna[i].equals("TCG")) {
					baseRna[i]="AGC-Serina";			
				}
				if(baseDna[i].equals("TCT")) {
					baseRna[i]="AGA-Arginina";			
				}
				if(baseDna[i].equals("TCC")) {
					baseRna[i]="AGG-Arginina";			
				}
                ///////////////////////////////
				if(baseDna[i].equals("CAA")) {
					baseRna[i]="GUU-Valina";			
				}
				if(baseDna[i].equals("CAG")) {
					baseRna[i]="GUC-Valina";			
				}
				if(baseDna[i].equals("CAT")) {
					baseRna[i]="GUA-Valina";			
				}
				if(baseDna[i].equals("CAC")) {
					baseRna[i]="GUG-Valina";			
				}
                ///////////////////////////////
				if(baseDna[i].equals("CGA")) {
					baseRna[i]="GCU-Alanina";			
				}
				if(baseDna[i].equals("CGG")) {
					baseRna[i]="GCC-Alanina";			
				}
				if(baseDna[i].equals("CGT")) {
					baseRna[i]="GCA-Alanina";			
				}
				if(baseDna[i].equals("CGC")) {
					baseRna[i]="GCG-Alanina";			
				}
                ///////////////////////////////
				if(baseDna[i].equals("CTA")) {
					baseRna[i]="GAU-Ácido Aspártico";			
				}
				if(baseDna[i].equals("CTG")) {
					baseRna[i]="GAC-Ácido Aspártico";			
				}
				if(baseDna[i].equals("CTT")) {
					baseRna[i]="GAA-Ácido Glutâmico";			
				}
				if(baseDna[i].equals("CTC")) {
					baseRna[i]="GAG-Ácido Glutâmico";			
				}
                ///////////////////////////////
				if(baseDna[i].equals("CCA")) {
					baseRna[i]="GGU-Glicina";			
				}
				if(baseDna[i].equals("CCG")) {
					baseRna[i]="GGC-Glicina";			
				}
				if(baseDna[i].equals("CCT")) {
					baseRna[i]="GGA-Glicina";			
				}
				if(baseDna[i].equals("CCC")) {
					baseRna[i]="GGG-Glicina";			
				}
			
                ///////////////////////////////	
				
			System.out.println(baseRna[i]);	
	}

			int posicao=0;
			int i;
			int num=0;
			for(i=0; i<baseDna.length; i++) {
				if(baseRna[i].equals("AUG-Metionina")) {
					num=i;
				}
			}
			
			System.out.println("");
			System.out.println("Traducao:");
			for(i=num; i<baseDna.length; i++) {
				System.out.println(baseRna[i]);
				
			}
			
	}

}
