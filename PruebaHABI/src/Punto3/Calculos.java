package Punto3;

import java.util.ArrayList;
import java.util.Scanner;

public class Calculos {
	ArrayList<Collages_Tables> collages_tables = new ArrayList();
	ArrayList<Contests_Table> Contests_table = new ArrayList();
	ArrayList<Submission_Stats_Table> submission_stats_table = new ArrayList();
	ArrayList<Tabla_resp> tabla_resp = new ArrayList();
	ArrayList<Table> table = new ArrayList();
	ArrayList<View_Starts_Table> View_starts_table = new ArrayList();
	public Calculos() {
		super();
	}
	public Calculos(ArrayList<Collages_Tables> collages_tables, ArrayList<Contests_Table> contests_table,
			ArrayList<Submission_Stats_Table> submission_stats_table, ArrayList<Tabla_resp> tabla_resp,
			ArrayList<Table> table, ArrayList<View_Starts_Table> view_starts_table) {
		super();
		this.collages_tables = collages_tables;
		Contests_table = contests_table;
		this.submission_stats_table = submission_stats_table;
		this.tabla_resp = tabla_resp;
		this.table = table;
		View_starts_table = view_starts_table;
	}
	
	public void añadirContestTable(/*int contest_id, int hacker_id, String name*/Contests_Table  CT) {
		//Contests_Table nuevo = new Contests_Table(contest_id,hacker_id,name);
		Contests_table.add(CT);
	}
	public void añadirCollages_Tables(/*int collage_id, int contest_id*/ Collages_Tables COLT) {
		//Collages_Tables nuevo = new Collages_Tables(collage_id,contest_id);
		collages_tables.add(COLT);
	}
	public void añadirTable(/*int challenge_id, int college_id*/ Table T) {
		//Table nuevo = new Table(challenge_id,college_id);
		table.add(T);
	}
	public void añadirView_Starts_Table(/*int challenge_id, int total_views, int total_unique_views*/ View_Starts_Table VST) {
		//View_Starts_Table nuevo = new View_Starts_Table(challenge_id, total_views, total_unique_views);
		View_starts_table.add(VST);
	}
	public void añadirSubmission_Stats_Table(/*int challenge_id, int total_submissions, int total_accepted_submissions*/ Submission_Stats_Table SST) {
		//Submission_Stats_Table nuevo = new Submission_Stats_Table(challenge_id, total_submissions, total_accepted_submissions);
		submission_stats_table.add(SST);
	}
	public void crearTabla_Resp() {
		for (int i = 0; i < Contests_table.size(); i++) {
			Tabla_resp nuevo = new Tabla_resp();
			nuevo.setContest_id(Contests_table.get(i).getContest_id());
			nuevo.setHacker_id(Contests_table.get(i).getHacker_id());
			nuevo.setName(Contests_table.get(i).getName());
			nuevo.setTotal_submissions(0);
			nuevo.setTotal_accepted_submissions(0);
			nuevo.setTotal_views(0);
			nuevo.setTotal_unique_views(0);
			for (int j = 0; j < collages_tables.size(); j++) {
				int collage_id;
				if(collages_tables.get(j).getContest_id()==nuevo.getContest_id()) {
					int Challenge_id;
					collage_id = collages_tables.get(j).getCollege_id();
					for (int k = 0; k < table.size(); k++) {
						if(table.get(k).getCollege_id()==collage_id) {
							Challenge_id= table.get(k).getChallenge_id();
							for (int k2 = 0; k2 < submission_stats_table.size(); k2++) {
								if(Challenge_id==submission_stats_table.get(k2).getChallenge_id()) {
									nuevo.setTotal_submissions(nuevo.getTotal_submissions()+submission_stats_table.get(k2).getTotal_submissions());
									nuevo.setTotal_accepted_submissions(nuevo.getTotal_accepted_submissions()+submission_stats_table.get(k2).getTotal_accepted_submissions());
								}
							}
							for (int l = 0; l < View_starts_table.size(); l++) {
								if(Challenge_id==View_starts_table.get(l).getChallenge_id()) {
									nuevo.setTotal_views(nuevo.getTotal_views()+View_starts_table.get(l).getTotal_views());
									nuevo.setTotal_unique_views(nuevo.getTotal_unique_views()+View_starts_table.get(l).getTotal_unique_views());
								}
							}
						}
					}
				}
			}
			int sum= nuevo.getTotal_submissions()+nuevo.getTotal_accepted_submissions()+nuevo.getTotal_views()+nuevo.getTotal_unique_views();
			if(sum!=0) {
				tabla_resp.add(nuevo);
			}
			
		}
		
	}
	public String imprimir() {
		String rta="";
		for (int i = 0; i < tabla_resp.size(); i++) {
			rta+=tabla_resp.get(i).getContest_id()+" "+tabla_resp.get(i).getHacker_id()+" "+tabla_resp.get(i).getName()+
					" "+tabla_resp.get(i).getTotal_submissions()+" "+tabla_resp.get(i).getTotal_accepted_submissions()+
					" "+tabla_resp.get(i).getTotal_views()+" "+tabla_resp.get(i).getTotal_unique_views()+"\n";
		}
		return rta;
	}
	
	public ArrayList<Collages_Tables> getCollages_tables() {
		return collages_tables;
	}
	public void setCollages_tables(ArrayList<Collages_Tables> collages_tables) {
		this.collages_tables = collages_tables;
	}
	public ArrayList<Contests_Table> getContests_table() {
		return Contests_table;
	}
	public void setContests_table(ArrayList<Contests_Table> contests_table) {
		Contests_table = contests_table;
	}
	public ArrayList<Submission_Stats_Table> getSubmission_stats_table() {
		return submission_stats_table;
	}
	public void setSubmission_stats_table(ArrayList<Submission_Stats_Table> submission_stats_table) {
		this.submission_stats_table = submission_stats_table;
	}
	public ArrayList<Tabla_resp> getTabla_resp() {
		return tabla_resp;
	}
	public void setTabla_resp(ArrayList<Tabla_resp> tabla_resp) {
		this.tabla_resp = tabla_resp;
	}
	public ArrayList<Table> getTable() {
		return table;
	}
	public void setTable(ArrayList<Table> table) {
		this.table = table;
	}
	public ArrayList<View_Starts_Table> getView_starts_table() {
		return View_starts_table;
	}
	public void setView_starts_table(ArrayList<View_Starts_Table> view_starts_table) {
		View_starts_table = view_starts_table;
	}
	
	public static void main(String[] args) {
		Calculos calculos = new Calculos();
		
		/*Contests_Table CT1 = new Contests_Table(66406, 17973, "Rose");
		Contests_Table CT2 = new Contests_Table(66556, 79153, "Angela");
		Contests_Table CT3 = new Contests_Table(94828, 80275, "Frank");
		calculos.añadirContestTable(CT1);
		calculos.añadirContestTable(CT2);
		calculos.añadirContestTable(CT3);
		
		Collages_Tables CLT1 = new Collages_Tables(11219, 66406);
		Collages_Tables CLT2 = new Collages_Tables(32473, 66556);
		Collages_Tables CLT3 = new Collages_Tables(56685, 94828);
		calculos.añadirCollages_Tables(CLT1);
		calculos.añadirCollages_Tables(CLT2);
		calculos.añadirCollages_Tables(CLT3);
		
		Table T1 = new Table(18765, 11219);
		Table T2 = new Table(47127, 11219);
		Table T3 = new Table(60292, 32473);
		Table T4 = new Table(72974, 56685);
		calculos.añadirTable(T1);
		calculos.añadirTable(T2);
		calculos.añadirTable(T3);
		calculos.añadirTable(T4);
		
		View_Starts_Table VST1 = new View_Starts_Table(47127, 26 ,19);
		View_Starts_Table VST2 = new View_Starts_Table(47127, 15 ,14);
		View_Starts_Table VST3 = new View_Starts_Table(18765, 43 ,10);
		View_Starts_Table VST4 = new View_Starts_Table(18765, 72 ,13);
		View_Starts_Table VST5 = new View_Starts_Table(75516, 35 ,17);
		View_Starts_Table VST6 = new View_Starts_Table(60292, 11 ,10);
		View_Starts_Table VST7 = new View_Starts_Table(72974, 41 ,15);
		View_Starts_Table VST8 = new View_Starts_Table(75516, 75 ,11);
		calculos.añadirView_Starts_Table(VST1);
		calculos.añadirView_Starts_Table(VST2);
		calculos.añadirView_Starts_Table(VST3);
		calculos.añadirView_Starts_Table(VST4);
		calculos.añadirView_Starts_Table(VST5);
		calculos.añadirView_Starts_Table(VST6);
		calculos.añadirView_Starts_Table(VST7);
		calculos.añadirView_Starts_Table(VST8);
		
		Submission_Stats_Table SST1 = new Submission_Stats_Table(75516, 34, 12);
		Submission_Stats_Table SST2 = new Submission_Stats_Table(47127, 27, 10);
		Submission_Stats_Table SST3 = new Submission_Stats_Table(47127, 56, 18);
		Submission_Stats_Table SST4 = new Submission_Stats_Table(75516, 74, 12);
		Submission_Stats_Table SST5 = new Submission_Stats_Table(75516, 83, 8);
		Submission_Stats_Table SST6 = new Submission_Stats_Table(72974, 68, 24);
		Submission_Stats_Table SST7 = new Submission_Stats_Table(72974, 82, 14);
		Submission_Stats_Table SST8 = new Submission_Stats_Table(47127, 28, 11);
		calculos.añadirSubmission_Stats_Table(SST1);
		calculos.añadirSubmission_Stats_Table(SST2);
		calculos.añadirSubmission_Stats_Table(SST3);
		calculos.añadirSubmission_Stats_Table(SST4);
		calculos.añadirSubmission_Stats_Table(SST5);
		calculos.añadirSubmission_Stats_Table(SST6);
		calculos.añadirSubmission_Stats_Table(SST7);
		calculos.añadirSubmission_Stats_Table(SST8);*/
		Scanner leer =new Scanner(System.in);
		System.out.println("Digite las filas de la tabla 'contests table' ");
		int CT = leer.nextInt();
		for (int i = 0; i < CT; i++) {
			int contestid = leer.nextInt();
			int hackerid = leer.nextInt();
			String name = leer.next();
			Contests_Table CT1 = new Contests_Table(contestid, hackerid, name);
			calculos.añadirContestTable(CT1);
		}
		System.out.println("Digite las filas de la tabla 'colleges table' ");
		CT = leer.nextInt();
		for (int i = 0; i < CT; i++) {
			int collegeid = leer.nextInt();
			int contestid = leer.nextInt();			
			Collages_Tables CLT3 = new Collages_Tables(collegeid, contestid);
			calculos.añadirCollages_Tables(CLT3);
		}
		System.out.println("Digite las filas de la tabla 'Table' ");
		CT = leer.nextInt();
		for (int i = 0; i < CT; i++) {
			int challengeid = leer.nextInt();
			int collegeid = leer.nextInt();			
			Table T4 = new Table(challengeid, collegeid);
			calculos.añadirTable(T4);
		}
		System.out.println("Digite las filas de la tabla 'View_Stats Table' ");
		CT = leer.nextInt();
		for (int i = 0; i < CT; i++) {
			int challengeid = leer.nextInt();
			int totalviews = leer.nextInt();
			int totaluniqueviews = leer.nextInt();
			View_Starts_Table VST8 = new View_Starts_Table(challengeid, totalviews ,totaluniqueviews);
			calculos.añadirView_Starts_Table(VST8);
		}
		System.out.println("Digite las filas de la tabla 'Submission_Stats Table' ");
		CT = leer.nextInt();
		for (int i = 0; i < CT; i++) {
			int challengeid = leer.nextInt();
			int totalSubmissions = leer.nextInt();
			int totalaccepted = leer.nextInt();
			Submission_Stats_Table SST8 = new Submission_Stats_Table(challengeid, totalSubmissions, totalaccepted);
			calculos.añadirSubmission_Stats_Table(SST8);
		}
		calculos.crearTabla_Resp();
		System.out.println(calculos.imprimir());
		}

}
