package com.example.Model;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity
@Table(name = "taxe") // Corrected placement

public class Taxe implements Serializable {


	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private int id;

    @Column(name = "periode") // Specify the column name for  "Periode_de_declaration_du_au "
    private double Periode_de_declaration_du_au ;

    @Column(name = "soc") // Specify the column name for "company_name"
    private double Elzei_Cons;

    @Column(name = "ss") // Specify the column name for "address_name"
    private double address_name;

    @Column(name = "sie") // Specify the column name for "sie"
    private double sie;

    @Column(name = "numD") // Specify the column name for "numD"
    private double numD;

   
    
    @Column(name = "cle") // Specify the column name for "cle"
    private double cle;
    

    @Column(name = "periode") // Specify the column name for "periode"
    private double periode;

    @Column(name = "cm") // Specify the column name for "cm"
    private double cm;

    @Column(name = "opt") // Specify the column name for "opt"
    private double opt;
    
    @Column(name = "Code_service") // Specify the column name for "Code_service"
    private double Code_service;
    

    @Column(name = "Regime") // Specify the column name for "Regime"
    private double Regime;

    @Column(name = "Num_id_et") // Specify the column name for "Num_id_et"
    private double Num_id_et;

    @Column(name = "N_TVA_intracommunautaire") // Specify the column name for "N_TVA_intracommunautaire"
    private double N_TVA_intracommunautaire;

    @Column(name = "T1") // Specify the column name for "T1"
    private double T1;

    // *Salaries and deductions:*
    @Column(name = "T2") // Specify the column name for "T2"
    private double T2;

    @Column(name = "T3") // Specify the column name for "T3"
    private double T3; // Calculated value

    @Column(name = "mod_dec") // Specify the column name for "mod_dec"
    private double mod_dec; // Calculated value

    @Column(name = "reserv_admin") // Specify the column name for "reserv_admin"
    private double reserv_admin;

    @Column(name = "date") // Specify the column name for "date"
    private double date;

    @Column(name = "phone") // Specify the column name for "phone"
    private double phone;

    @Column(name = "date_2") // Specify the column name for "date_2"
    private double date_2; // Calculated value

    // *Deductions:*
    @Column(name = "Somme") // Specify the column name for "Somme"
    private double Somme;

    @Column(name = "penalites") // Specify the column name for "penalites"
    private double penalites; // Calculated value

    @Column(name = "penalite_taux_5") // Specify the column name for "penalite_taux_5"
    private double penalite_taux_5; // Calculated value

    @Column(name = "penalite_taux_x") // Specify the column name for "penalite_taux_x"
    private double penalite_taux_x; // Calculated value
    
    @Column(name = "penalite_taux_y") // Specify the column name for "penalite_taux_y"
    private double penalite_taux_y; // Calculated value


    @Column(name = "Si_vous_payez_par_virements_precisez_le_nombre") // Specify the column name for "Si_vous_payez_par_virements_precisez_le_nombre"
    private double Si_vous_payez_par_virements_precisez_le_nombre;

    @Column(name = "date_reception") // Specify the column name for "date_reception"
    private double date_reception;
    
    @Column(name = "A1_979") // Specify the column name for "A1_979"
    private int A1_979;

    @Column(name = "A2_981") // Specify the column name for "A2_981"
    private int A2_981;
    
    @Column(name = "A3_44") // Specify the column name for "A3_44"
    private int A3_44;
    
    @Column(name = "A4_56") // Specify the column name for "A4_56"
    private int A4_56;
    
    @Column(name = "A5_51") // Specify the column name for "A5_51"
    private int A5_51;
    
    @Column(name = "B1_48") // Specify the column name for "B1_48"
    private int B1_48;
    
    @Column(name = "B2_31") // Specify the column name for "B2_31"
    private int B2_31;
    
    @Column(name = "B3_30") // Specify the column name for "B3_30"
    private int B3_30;
    
    @Column(name = "B4_40") // Specify the column name for "B4_40"
    private int B4_40;
    
    @Column(name = "B5_36") // Specify the column name for "B5_36"
    private int B5_36;
    
    @Column(name = "E1_32") // Specify the column name for "E1_32"
    private int E1_32;
    
    public double getCompany_name() {
		return company_name;
	}

	public void setCompany_name(double company_name) {
		this.company_name = company_name;
	}

	public int getA1_979() {
		return A1_979;
	}

	public void setA1_979(int a1_979) {
		A1_979 = a1_979;
	}

	public int getA2_981() {
		return A2_981;
	}

	public void setA2_981(int a2_981) {
		A2_981 = a2_981;
	}

	public int getA3_44() {
		return A3_44;
	}

	public void setA3_44(int a3_44) {
		A3_44 = a3_44;
	}

	public int getA4_56() {
		return A4_56;
	}

	public void setA4_56(int a4_56) {
		A4_56 = a4_56;
	}

	public int getA5_51() {
		return A5_51;
	}

	public void setA5_51(int a5_51) {
		A5_51 = a5_51;
	}

	public int getB1_48() {
		return B1_48;
	}

	public void setB1_48(int b1_48) {
		B1_48 = b1_48;
	}

	public int getB2_31() {
		return B2_31;
	}

	public void setB2_31(int b2_31) {
		B2_31 = b2_31;
	}

	public int getB3_30() {
		return B3_30;
	}

	public void setB3_30(int b3_30) {
		B3_30 = b3_30;
	}

	public int getB4_40() {
		return B4_40;
	}

	public void setB4_40(int b4_40) {
		B4_40 = b4_40;
	}

	public int getB5_36() {
		return B5_36;
	}

	public void setB5_36(int b5_36) {
		B5_36 = b5_36;
	}

	public int getE1_32() {
		return E1_32;
	}

	public void setE1_32(int e1_32) {
		E1_32 = e1_32;
	}

	public int getE2_33() {
		return E2_33;
	}

	public void setE2_33(int e2_33) {
		E2_33 = e2_33;
	}

	public int getE3_47() {
		return E3_47;
	}

	public void setE3_47(int e3_47) {
		E3_47 = e3_47;
	}

	public int getE4_52() {
		return E4_52;
	}

	public void setE4_52(int e4_52) {
		E4_52 = e4_52;
	}

	public int getE5_53() {
		return E5_53;
	}

	public void setE5_53(int e5_53) {
		E5_53 = e5_53;
	}

	public int getE6_54() {
		return E6_54;
	}

	public void setE6_54(int e6_54) {
		E6_54 = e6_54;
	}

	public int getF1_55() {
		return F1_55;
	}

	public void setF1_55(int f1_55) {
		F1_55 = f1_55;
	}

	public int getF2_34() {
		return F2_34;
	}

	public void setF2_34(int f2_34) {
		F2_34 = f2_34;
	}

	public int getF3_29() {
		return F3_29;
	}

	public void setF3_29(int f3_29) {
		F3_29 = f3_29;
	}

	public int getF4_49() {
		return F4_49;
	}

	public void setF4_49(int f4_49) {
		F4_49 = f4_49;
	}

	public int getF5_50() {
		return F5_50;
	}

	public void setF5_50(int f5_50) {
		F5_50 = f5_50;
	}

	public int getF6_37() {
		return F6_37;
	}

	public void setF6_37(int f6_37) {
		F6_37 = f6_37;
	}

	public int getF7_43() {
		return F7_43;
	}

	public void setF7_43(int f7_43) {
		F7_43 = f7_43;
	}

	public int getF8_39() {
		return F8_39;
	}

	public void setF8_39(int f8_39) {
		F8_39 = f8_39;
	}

	public int getF9_61() {
		return F9_61;
	}

	public void setF9_61(int f9_61) {
		F9_61 = f9_61;
	}

	public int getTVA_brute_207() {
		return TVA_brute_207;
	}

	public void setTVA_brute_207(int tVA_brute_207) {
		TVA_brute_207 = tVA_brute_207;
	}

	public int getTVA_brute_105() {
		return TVA_brute_105;
	}

	public void setTVA_brute_105(int tVA_brute_105) {
		TVA_brute_105 = tVA_brute_105;
	}

	public int getTVA_brute_151() {
		return TVA_brute_151;
	}

	public void setTVA_brute_151(int tVA_brute_151) {
		TVA_brute_151 = tVA_brute_151;
	}

	public int getTVA_brute_201() {
		return TVA_brute_201;
	}

	public void setTVA_brute_201(int tVA_brute_201) {
		TVA_brute_201 = tVA_brute_201;
	}

	public int getTVA_brute_100() {
		return TVA_brute_100;
	}

	public void setTVA_brute_100(int tVA_brute_100) {
		TVA_brute_100 = tVA_brute_100;
	}

	public int getTVA_brute_1120() {
		return TVA_brute_1120;
	}

	public void setTVA_brute_1120(int tVA_brute_1120) {
		TVA_brute_1120 = tVA_brute_1120;
	}

	public int getTVA_brute_1110() {
		return TVA_brute_1110;
	}

	public void setTVA_brute_1110(int tVA_brute_1110) {
		TVA_brute_1110 = tVA_brute_1110;
	}

	public int getTVA_brute_1090() {
		return TVA_brute_1090;
	}

	public void setTVA_brute_1090(int tVA_brute_1090) {
		TVA_brute_1090 = tVA_brute_1090;
	}

	public int getTVA_brute_1081() {
		return TVA_brute_1081;
	}

	public void setTVA_brute_1081(int tVA_brute_1081) {
		TVA_brute_1081 = tVA_brute_1081;
	}

	public int getTVA_brute_1050() {
		return TVA_brute_1050;
	}

	public void setTVA_brute_1050(int tVA_brute_1050) {
		TVA_brute_1050 = tVA_brute_1050;
	}

	public int getTVA_brute_1040() {
		return TVA_brute_1040;
	}

	public void setTVA_brute_1040(int tVA_brute_1040) {
		TVA_brute_1040 = tVA_brute_1040;
	}

	public int getTVA_brute_1010() {
		return TVA_brute_1010;
	}

	public void setTVA_brute_1010(int tVA_brute_1010) {
		TVA_brute_1010 = tVA_brute_1010;
	}

	public int getTVA_brute_990() {
		return TVA_brute_990;
	}

	public void setTVA_brute_990(int tVA_brute_990) {
		TVA_brute_990 = tVA_brute_990;
	}

	public int getTVA_brute_900() {
		return TVA_brute_900;
	}

	public void setTVA_brute_900(int tVA_brute_900) {
		TVA_brute_900 = tVA_brute_900;
	}

	public int getTVA_brute_208() {
		return TVA_brute_208;
	}

	public void setTVA_brute_208(int tVA_brute_208) {
		TVA_brute_208 = tVA_brute_208;
	}

	public int getTVA_brute_152() {
		return TVA_brute_152;
	}

	public void setTVA_brute_152(int tVA_brute_152) {
		TVA_brute_152 = tVA_brute_152;
	}

	public int getTVA_brute_210() {
		return TVA_brute_210;
	}

	public void setTVA_brute_210(int tVA_brute_210) {
		TVA_brute_210 = tVA_brute_210;
	}

	public int getTVA_brute_211() {
		return TVA_brute_211;
	}

	public void setTVA_brute_211(int tVA_brute_211) {
		TVA_brute_211 = tVA_brute_211;
	}

	public int getTVA_brute_212() {
		return TVA_brute_212;
	}

	public void setTVA_brute_212(int tVA_brute_212) {
		TVA_brute_212 = tVA_brute_212;
	}

	public int getTVA_brute_213() {
		return TVA_brute_213;
	}

	public void setTVA_brute_213(int tVA_brute_213) {
		TVA_brute_213 = tVA_brute_213;
	}

	public int getTVA_brute_214() {
		return TVA_brute_214;
	}

	public void setTVA_brute_214(int tVA_brute_214) {
		TVA_brute_214 = tVA_brute_214;
	}

	public int getTVA_brute_215() {
		return TVA_brute_215;
	}

	public void setTVA_brute_215(int tVA_brute_215) {
		TVA_brute_215 = tVA_brute_215;
	}

	public int getTVA_brute_600() {
		return TVA_brute_600;
	}

	public void setTVA_brute_600(int tVA_brute_600) {
		TVA_brute_600 = tVA_brute_600;
	}

	public int getTVA_brute_602() {
		return TVA_brute_602;
	}

	public void setTVA_brute_602(int tVA_brute_602) {
		TVA_brute_602 = tVA_brute_602;
	}

	public int getTotal_TVA_brute() {
		return total_TVA_brute;
	}

	public void setTotal_TVA_brute(int total_TVA_brute) {
		this.total_TVA_brute = total_TVA_brute;
	}

	public int getTVA_brute_35() {
		return TVA_brute_35;
	}

	public void setTVA_brute_35(int tVA_brute_35) {
		TVA_brute_35 = tVA_brute_35;
	}

	public int getTVA_brute_38() {
		return TVA_brute_38;
	}

	public void setTVA_brute_38(int tVA_brute_38) {
		TVA_brute_38 = tVA_brute_38;
	}

	public int getTVA_deductible_703() {
		return TVA_deductible_703;
	}

	public void setTVA_deductible_703(int tVA_deductible_703) {
		TVA_deductible_703 = tVA_deductible_703;
	}

	public int getTVA_deductible_702() {
		return TVA_deductible_702;
	}

	public void setTVA_deductible_702(int tVA_deductible_702) {
		TVA_deductible_702 = tVA_deductible_702;
	}

	public int getTVA_deductible_59() {
		return TVA_deductible_59;
	}

	public void setTVA_deductible_59(int tVA_deductible_59) {
		TVA_deductible_59 = tVA_deductible_59;
	}

	public int getTVA_deductible_8001() {
		return TVA_deductible_8001;
	}

	public void setTVA_deductible_8001(int tVA_deductible_8001) {
		TVA_deductible_8001 = tVA_deductible_8001;
	}

	public int getTVA_deductible_603() {
		return TVA_deductible_603;
	}

	public void setTVA_deductible_603(int tVA_deductible_603) {
		TVA_deductible_603 = tVA_deductible_603;
	}

	public int getTotal_TVA_deductible() {
		return total_TVA_deductible;
	}

	public void setTotal_TVA_deductible(int total_TVA_deductible) {
		this.total_TVA_deductible = total_TVA_deductible;
	}

	public int getTVA_deductible_711() {
		return TVA_deductible_711;
	}

	public void setTVA_deductible_711(int tVA_deductible_711) {
		TVA_deductible_711 = tVA_deductible_711;
	}

	public int getCredit_TVA_705() {
		return credit_TVA_705;
	}

	public void setCredit_TVA_705(int credit_TVA_705) {
		this.credit_TVA_705 = credit_TVA_705;
	}

	public int getTVA_due_8900() {
		return TVA_due_8900;
	}

	public void setTVA_due_8900(int tVA_due_8900) {
		TVA_due_8900 = tVA_due_8900;
	}

	public int getTVA_due() {
		return TVA_due;
	}

	public void setTVA_due(int tVA_due) {
		TVA_due = tVA_due;
	}

	public int getRegul_1() {
		return regul_1;
	}

	public void setRegul_1(int regul_1) {
		this.regul_1 = regul_1;
	}

	public int getRegul_2() {
		return regul_2;
	}

	public void setRegul_2(int regul_2) {
		this.regul_2 = regul_2;
	}

	public int getRegul_3() {
		return regul_3;
	}

	public void setRegul_3(int regul_3) {
		this.regul_3 = regul_3;
	}

	public int getCredit_impute_TVA_X() {
		return credit_impute_TVA_X;
	}

	public void setCredit_impute_TVA_X(int credit_impute_TVA_X) {
		this.credit_impute_TVA_X = credit_impute_TVA_X;
	}

	public int getCredit_impute_TVA_x() {
		return credit_impute_TVA_x;
	}

	public void setCredit_impute_TVA_x(int credit_impute_TVA_x) {
		this.credit_impute_TVA_x = credit_impute_TVA_x;
	}

	public int getRepliquat_credit_Y() {
		return repliquat_credit_Y;
	}

	public void setRepliquat_credit_Y(int repliquat_credit_Y) {
		this.repliquat_credit_Y = repliquat_credit_Y;
	}

	public int getRepliquat_credit_y() {
		return repliquat_credit_y;
	}

	public void setRepliquat_credit_y(int repliquat_credit_y) {
		this.repliquat_credit_y = repliquat_credit_y;
	}

	public int getTaxe_due_1() {
		return taxe_due_1;
	}

	public void setTaxe_due_1(int taxe_due_1) {
		this.taxe_due_1 = taxe_due_1;
	}

	public int getTaxe_due_2() {
		return taxe_due_2;
	}

	public void setTaxe_due_2(int taxe_due_2) {
		this.taxe_due_2 = taxe_due_2;
	}

	public int getMontant_electricite() {
		return montant_electricite;
	}

	public void setMontant_electricite(int montant_electricite) {
		this.montant_electricite = montant_electricite;
	}

	public int getMontant_X1() {
		return montant_X1;
	}

	public void setMontant_X1(int montant_X1) {
		this.montant_X1 = montant_X1;
	}

	public int getMontant_Y1() {
		return montant_Y1;
	}

	public void setMontant_Y1(int montant_Y1) {
		this.montant_Y1 = montant_Y1;
	}

	public int getMontant_Z1() {
		return montant_Z1;
	}

	public void setMontant_Z1(int montant_Z1) {
		this.montant_Z1 = montant_Z1;
	}

	public int getMontant_gaz() {
		return montant_gaz;
	}

	public void setMontant_gaz(int montant_gaz) {
		this.montant_gaz = montant_gaz;
	}

	public int getMontant_X2() {
		return montant_X2;
	}

	public void setMontant_X2(int montant_X2) {
		this.montant_X2 = montant_X2;
	}

	public int getMontant_Y2() {
		return montant_Y2;
	}

	public void setMontant_Y2(int montant_Y2) {
		this.montant_Y2 = montant_Y2;
	}

	public int getMontant_Z2() {
		return montant_Z2;
	}

	public void setMontant_Z2(int montant_Z2) {
		this.montant_Z2 = montant_Z2;
	}

	public int getMontant_charbons() {
		return montant_charbons;
	}

	public void setMontant_charbons(int montant_charbons) {
		this.montant_charbons = montant_charbons;
	}

	public int getMontant_X3() {
		return montant_X3;
	}

	public void setMontant_X3(int montant_X3) {
		this.montant_X3 = montant_X3;
	}

	public int getMontant_Y3() {
		return montant_Y3;
	}

	public void setMontant_Y3(int montant_Y3) {
		this.montant_Y3 = montant_Y3;
	}

	public int getMontant_Z3() {
		return montant_Z3;
	}

	public void setMontant_Z3(int montant_Z3) {
		this.montant_Z3 = montant_Z3;
	}

	public int getTotal_regul() {
		return total_regul;
	}

	public void setTotal_regul(int total_regul) {
		this.total_regul = total_regul;
	}

	public int getCredit_constate_total() {
		return credit_constate_total;
	}

	public void setCredit_constate_total(int credit_constate_total) {
		this.credit_constate_total = credit_constate_total;
	}

	public int getMontant_X4() {
		return montant_X4;
	}

	public void setMontant_X4(int montant_X4) {
		this.montant_X4 = montant_X4;
	}

	public int getMontant_Y4() {
		return montant_Y4;
	}

	public void setMontant_Y4(int montant_Y4) {
		this.montant_Y4 = montant_Y4;
	}

	public int getMontant_Z4() {
		return montant_Z4;
	}

	public void setMontant_Z4(int montant_Z4) {
		this.montant_Z4 = montant_Z4;
	}

	public int getDet_montant_pay_credit_TVA_TIC() {
		return det_montant_pay_credit_TVA_TIC;
	}

	public void setDet_montant_pay_credit_TVA_TIC(int det_montant_pay_credit_TVA_TIC) {
		this.det_montant_pay_credit_TVA_TIC = det_montant_pay_credit_TVA_TIC;
	}

	public int getDet_8002() {
		return det_8002;
	}

	public void setDet_8002(int det_8002) {
		this.det_8002 = det_8002;
	}

	public int getDet_8005() {
		return det_8005;
	}

	public void setDet_8005(int det_8005) {
		this.det_8005 = det_8005;
	}

	public int getDet_8003() {
		return det_8003;
	}

	public void setDet_8003(int det_8003) {
		this.det_8003 = det_8003;
	}

	public int getDet_8113() {
		return det_8113;
	}

	public void setDet_8113(int det_8113) {
		this.det_8113 = det_8113;
	}

	public int getDet_8114() {
		return det_8114;
	}

	public void setDet_8114(int det_8114) {
		this.det_8114 = det_8114;
	}

	public int getDet_8103() {
		return det_8103;
	}

	public void setDet_8103(int det_8103) {
		this.det_8103 = det_8103;
	}

	public int getDet_8901() {
		return det_8901;
	}

	public void setDet_8901(int det_8901) {
		this.det_8901 = det_8901;
	}

	public int getDet_9979() {
		return det_9979;
	}

	public void setDet_9979(int det_9979) {
		this.det_9979 = det_9979;
	}

	public int getDet_8123() {
		return det_8123;
	}

	public void setDet_8123(int det_8123) {
		this.det_8123 = det_8123;
	}

	public int getDet_9991() {
		return det_9991;
	}

	public void setDet_9991(int det_9991) {
		this.det_9991 = det_9991;
	}

	public int getDet_9992() {
		return det_9992;
	}

	public void setDet_9992(int det_9992) {
		this.det_9992 = det_9992;
	}

	@Column(name = "E2_33") // Specify the column name for "E2_33"
    private int E2_33;
    
    @Column(name = "E3_47") // Specify the column name for "E3_47"
    private int E3_47;
    
    @Column(name = "E4_52") // Specify the column name for "E4_52"
    private int E4_52;
    
    @Column(name = "E5_53") // Specify the column name for "E5_53"
    private int E5_53;
    
    @Column(name = "E6_54") // Specify the column name for "E6_54"
    private int E6_54;
    
    @Column(name = "F1_55") // Specify the column name for "F1_55"
    private int F1_55;
    
    @Column(name = "F2_34") // Specify the column name for "F2_34"
    private int F2_34;
    
    @Column(name = "F3_29") // Specify the column name for "F3_29"
    private int F3_29;
    
    @Column(name = "F4_49") // Specify the column name for "F4_49"
    private int F4_49;
    
    @Column(name = "F5_50") // Specify the column name for "F5_50"
    private int F5_50;
    
    @Column(name = "F6_37") // Specify the column name for "F6_37"
    private int F6_37;
    
    @Column(name = "F7_43") // Specify the column name for "F7_43"
    private int F7_43;
    
    @Column(name = "F8_39") // Specify the column name for "F8_39"
    private int F8_39;
    
    @Column(name = "F9_61") // Specify the column name for "F9_61"
    private int F9_61;
    
    @Column(name = "TVA_brute_207") // Specify the column name for "TVA_brute_207"
    private int TVA_brute_207;
    
    @Column(name = "TVA_brute_105") // Specify the column name for "TVA_brute_105"
    private int TVA_brute_105;
    
    @Column(name = "TVA_brute_151") // Specify the column name for "TVA_brute_151"
    private int TVA_brute_151;
    
    @Column(name = "TVA_brute_201") // Specify the column name for "TVA_brute_201"
    private int TVA_brute_201;
    
    @Column(name = "TVA_brute_100") // Specify the column name for "TVA_brute_100"
    private int TVA_brute_100;
    
    @Column(name = "TVA_brute_1120") // Specify the column name for "TVA_brute_1120"
    private int TVA_brute_1120;
    
    @Column(name = "TVA_brute_1110") // Specify the column name for "TVA_brute_1110"
    private int TVA_brute_1110;
    
    @Column(name = "TVA_brute_1090") // Specify the column name for "TVA_brute_1090"
    private int TVA_brute_1090;
    
    @Column(name = "TVA_brute_1081") // Specify the column name for "TVA_brute_1081"
    private int TVA_brute_1081;
    
    @Column(name = "TVA_brute_1050") // Specify the column name for "TVA_brute_1050"
    private int TVA_brute_1050;
    
    @Column(name = "TVA_brute_1040") // Specify the column name for "TVA_brute_1040"
    private int TVA_brute_1040;
    
    @Column(name = "TVA_brute_1010") // Specify the column name for "TVA_brute_1010"
    private int TVA_brute_1010;
    
    @Column(name = "TVA_brute_990") // Specify the column name for "TVA_brute_990"
    private int TVA_brute_990;
    
    @Column(name = "TVA_brute_900") // Specify the column name for "TVA_brute_900"
    private int TVA_brute_900;
    
    @Column(name = "TVA_brute_208") // Specify the column name for "TVA_brute_208"
    private int TVA_brute_208;
    
    @Column(name = "TVA_brute_152") // Specify the column name for "TVA_brute_152"
    private int TVA_brute_152; 
    
    @Column(name = "TVA_brute_210") // Specify the column name for "TVA_brute_210"
    private int TVA_brute_210; 
    
    @Column(name = "TVA_brute_211") // Specify the column name for "TVA_brute_211"
    private int TVA_brute_211; 
    
    @Column(name = "TVA_brute_212") // Specify the column name for "TVA_brute_212"
    private int TVA_brute_212; 
    
    @Column(name = "TVA_brute_213") // Specify the column name for "TVA_brute_213"
    private int TVA_brute_213; 
    
    @Column(name = "TVA_brute_214") // Specify the column name for "TVA_brute_214"
    private int TVA_brute_214; 
    
    @Column(name = "TVA_brute_215") // Specify the column name for "TVA_brute_215"
    private int TVA_brute_215; 
    
    @Column(name = "TVA_brute_600") // Specify the column name for "TVA_brute_600"
    private int TVA_brute_600; 
    
    @Column(name = "TVA_brute_602") // Specify the column name for "TVA_brute_602"
    private int TVA_brute_602;
    
    @Column(name = "total_TVA_brute") // Specify the column name for "total_TVA_brute"
    private int total_TVA_brute;
    
    @Column(name = "TVA_brute_35") // Specify the column name for "TVA_brute_35"
    private int TVA_brute_35;
    
    @Column(name = "TVA_brute_38") // Specify the column name for "TVA_brute_38"
    private int TVA_brute_38;
    
    @Column(name = "TVA_deductible_703") // Specify the column name for "TVA_deductible_703"
    private int TVA_deductible_703;
    
    @Column(name = "TVA_deductible_702") // Specify the column name for "TVA_deductible_702"
    private int TVA_deductible_702;
    
    @Column(name = "TVA_deductible_59") // Specify the column name for "TVA_deductible_59"
    private int TVA_deductible_59;
    
    @Column(name = "TVA_deductible_8001") // Specify the column name for "TVA_deductible_8001"
    private int TVA_deductible_8001;
    
    @Column(name = "TVA_deductible_603") // Specify the column name for "TVA_deductible_603"
    private int TVA_deductible_603;
    
    @Column(name = "total_TVA_deductible") // Specify the column name for "total_TVA_deductible"
    private int total_TVA_deductible;
    
    @Column(name = "TVA_deductible_711") // Specify the column name for "TVA_deductible_711"
    private int TVA_deductible_711;
    
    @Column(name = "credit_TVA_705") // Specify the column name for "credit_TVA_705"
    private int credit_TVA_705;
    
    @Column(name = "TVA_due_8900") // Specify the column name for "TVA_due_8900"
    private int TVA_due_8900;
    
    @Column(name = "TVA_due") // Specify the column name for "TVA_due"
    private int TVA_due;
    
    @Column(name = "regul_1") // Specify the column name for "regul_1"
    private int regul_1;
    
    @Column(name = "regul_2") // Specify the column name for "regul_2"
    private int regul_2;
    
    @Column(name = "regul_3") // Specify the column name for "regul_3"
    private int regul_3;
    
    @Column(name = "credit_impute_TVA_X") // Specify the column name for "credit_impute_TVA_X"
    private int credit_impute_TVA_X;
    
    @Column(name = "credit_impute_TVA_x") // Specify the column name for "credit_impute_TVA_x"
    private int credit_impute_TVA_x;
    
    @Column(name = "repliquat_credit_Y") // Specify the column name for "repliquat_credit_Y"
    private int repliquat_credit_Y;
    
    @Column(name = "repliquat_credit_y") // Specify the column name for "repliquat_credit_y"
    private int repliquat_credit_y;
    
    @Column(name = "taxe_due_1") // Specify the column name for "taxe_due_1"
    private int taxe_due_1;
    
    @Column(name = "taxe_due_2") // Specify the column name for "taxe_due_2"
    private int taxe_due_2;
    
    @Column(name = "montant_electricite") // Specify the column name for "montant_electricite"
    private int montant_electricite;
    
    @Column(name = "montant_X1") // Specify the column name for "montant_X1"
    private int montant_X1;
    
    @Column(name = "montant_Y1") // Specify the column name for "montant_Y1"
    private int montant_Y1;
    
    @Column(name = "montant_Z1") // Specify the column name for "montant_Z1"
    private int montant_Z1;
    
    @Column(name = "montant_gaz") // Specify the column name for "montant_gaz"
    private int montant_gaz;
    
    @Column(name = "montant_X2") // Specify the column name for "montant_X2"
    private int montant_X2;
    
    @Column(name = "montant_Y2") // Specify the column name for "montant_Y2"
    private int montant_Y2;
    
    @Column(name = "montant_Z2") // Specify the column name for "montant_Z3"
    private int montant_Z2;
    
    @Column(name = "montant_charbons") // Specify the column name for "montant_charbons"
    private int montant_charbons;
    
    @Column(name = "montant_X3") // Specify the column name for "montant_X3"
    private int montant_X3;
    
    @Column(name = "montant_Y3") // Specify the column name for "montant_Y3"
    private int montant_Y3;
    
    @Column(name = "montant_Z3") // Specify the column name for "montant_Z3"
    private int montant_Z3;
    
    @Column(name = "total_regul") // Specify the column name for "total_regul"
    private int total_regul;
    
    @Column(name = "credit_constate_total") // Specify the column name for "credit_constate_total"
    private int credit_constate_total;
    
    @Column(name = "montant_X4") // Specify the column name for "montant_X4"
    private int montant_X4;
    
    @Column(name = "montant_Y4") // Specify the column name for "montant_Y4"
    private int montant_Y4;
    
    @Column(name = "montant_Z4") // Specify the column name for "montant_Z4"
    private int montant_Z4;
    
    @Column(name = "det_montant_pay_credit_TVA_TIC") // Specify the column name for "det_montant_pay_credit_TVA_TIC"
    private int det_montant_pay_credit_TVA_TIC;
    
    @Column(name = "det_8002") // Specify the column name for "det_8002"
    private int det_8002;
    
    @Column(name = "det_8005") // Specify the column name for "det_8005"
    private int det_8005;
    
    @Column(name = "det_8003") // Specify the column name for "det_8003"
    private int det_8003;
    
    @Column(name = "det_8113") // Specify the column name for "det_8113"
    private int det_8113;
    
    @Column(name = "det_8114") // Specify the column name for "det_8114"
    private int det_8114;
    
    @Column(name = "det_8103") // Specify the column name for "det_8103"
    private int det_8103;
    
    @Column(name = "det_8901") // Specify the column name for "det_8901"
    private int det_8901;
    
    @Column(name = "det_9979") // Specify the column name for "det_9979"
    private int det_9979;
    
    @Column(name = "det_8123") // Specify the column name for "det_8123"
    private int det_8123;
    
    @Column(name = "det_9991") // Specify the column name for "det_9991"
    private int det_9991;
    
    @Column(name = "det_9992") // Specify the column name for "det_9992"
    private int det_9992;
    
    
    
    
    
    
    
    
    
    
    
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getPeriode_de_declaration_du_au() {
		return Periode_de_declaration_du_au;
	}

	public void setPeriode_de_declaration_du_au(double periode_de_declaration_du_au) {
		Periode_de_declaration_du_au = periode_de_declaration_du_au;
	}

	public double getCompan_yname() {
		return company_name;
	}

	public void setCompan_yname(double compan_yname) {
		this.company_name = compan_yname;
	}

	public double getAddress_name() {
		return address_name;
	}

	public void setAddress_name(double address_name) {
		this.address_name = address_name;
	}

	public double getSie() {
		return sie;
	}

	public void setSie(double sie) {
		this.sie = sie;
	}

	public double getNumD() {
		return numD;
	}

	public void setNumD(double numD) {
		this.numD = numD;
	}

	public double getCle() {
		return cle;
	}

	public void setCle(double cle) {
		this.cle = cle;
	}

	public double getPeriode() {
		return periode;
	}

	public void setPeriode(double periode) {
		this.periode = periode;
	}

	public double getCm() {
		return cm;
	}

	public void setCm(double cm) {
		this.cm = cm;
	}

	public double getOpt() {
		return opt;
	}

	public void setOpt(double opt) {
		this.opt = opt;
	}

	public double getCode_service() {
		return Code_service;
	}

	public void setCode_service(double code_service) {
		Code_service = code_service;
	}

	public double getRegime() {
		return Regime;
	}

	public void setRegime(double regime) {
		Regime = regime;
	}

	public double getNum_id_et() {
		return Num_id_et;
	}

	public void setNum_id_et(double num_id_et) {
		Num_id_et = num_id_et;
	}

	public double getN_TVA_intracommunautaire() {
		return N_TVA_intracommunautaire;
	}

	public void setN_TVA_intracommunautaire(double n_TVA_intracommunautaire) {
		N_TVA_intracommunautaire = n_TVA_intracommunautaire;
	}

	public double getT1() {
		return T1;
	}

	public void setT1(double t1) {
		T1 = t1;
	}

	public double getT2() {
		return T2;
	}

	public void setT2(double t2) {
		T2 = t2;
	}

	public double getT3() {
		return T3;
	}

	public void setT3(double t3) {
		T3 = t3;
	}

	public double getMod_dec() {
		return mod_dec;
	}

	public void setMod_dec(double mod_dec) {
		this.mod_dec = mod_dec;
	}

	public double getReserv_admin() {
		return reserv_admin;
	}

	public void setReserv_admin(double reserv_admin) {
		this.reserv_admin = reserv_admin;
	}

	public double getDate() {
		return date;
	}

	public void setDate(double date) {
		this.date = date;
	}

	public double getPhone() {
		return phone;
	}

	public void setPhone(double phone) {
		this.phone = phone;
	}

	public double getDate_2() {
		return date_2;
	}

	public void setDate_2(double date_2) {
		this.date_2 = date_2;
	}

	public double getSomme() {
		return Somme;
	}

	public void setSomme(double somme) {
		Somme = somme;
	}

	public double getPenalites() {
		return penalites;
	}

	public void setPenalites(double penalites) {
		this.penalites = penalites;
	}

	public double getPenalite_taux_5() {
		return penalite_taux_5;
	}

	public void setPenalite_taux_5(double penalite_taux_5) {
		this.penalite_taux_5 = penalite_taux_5;
	}

	public double getPenalite_taux_x() {
		return penalite_taux_x;
	}

	public void setPenalite_taux_x(double penalite_taux_x) {
		this.penalite_taux_x = penalite_taux_x;
	}

	public double getPenalite_taux_y() {
		return penalite_taux_y;
	}

	public void setPenalite_taux_y(double penalite_taux_y) {
		this.penalite_taux_y = penalite_taux_y;
	}

	public double getSi_vous_payez_par_virements_precisez_le_nombre() {
		return Si_vous_payez_par_virements_precisez_le_nombre;
	}

	public void setSi_vous_payez_par_virements_precisez_le_nombre(double si_vous_payez_par_virements_precisez_le_nombre) {
		Si_vous_payez_par_virements_precisez_le_nombre = si_vous_payez_par_virements_precisez_le_nombre;
	}

	public double getDate_reception() {
		return date_reception;
	}

	public void setDate_reception(double date_reception) {
		this.date_reception = date_reception;
	}

	public Taxe(int id, double periode_de_declaration_du_au, double compan_yname, double address_name, double sie,
			double numD, double cle, double periode, double cm, double opt, double code_service, double regime,
			double num_id_et, double n_TVA_intracommunautaire, double t1, double t2, double t3, double mod_dec,
			double reserv_admin, double date, double phone, double date_2, double somme, double penalites,
			double penalite_taux_5, double penalite_taux_x, double penalite_taux_y,
			double si_vous_payez_par_virements_precisez_le_nombre, double date_reception) {
		super();
		this.id = id;
		this.Periode_de_declaration_du_au = periode_de_declaration_du_au;
		this.company_name = compan_yname;
		this.address_name = address_name;
		this.sie = sie;
		this.numD = numD;
		this.cle = cle;
		this.periode = periode;
		this.cm = cm;
		this.opt = opt;
		this.Code_service = code_service;
		this.Regime = regime;
		this.Num_id_et = num_id_et;
		this.N_TVA_intracommunautaire = n_TVA_intracommunautaire;
		this.T1 = t1;
		this.T2 = t2;
		this.T3 = t3;
		this.mod_dec = mod_dec;
		this.reserv_admin = reserv_admin;
		this.date = date;
		this.phone = phone;
		this.date_2 = date_2;
		this.Somme = somme;
		this.penalites = penalites;
		this.penalite_taux_5 = penalite_taux_5;
		this.penalite_taux_x = penalite_taux_x;
		this.penalite_taux_y = penalite_taux_y;
		this.Si_vous_payez_par_virements_precisez_le_nombre = si_vous_payez_par_virements_precisez_le_nombre;
		this.date_reception = date_reception;
	}

	@Override
	public String toString() {
		return "Taxe [id=" + id + ", Periode_de_declaration_du_au=" + Periode_de_declaration_du_au + ", compan_yname="
				+ company_name + ", address_name=" + address_name + ", sie=" + sie + ", numD=" + numD + ", cle=" + cle
				+ ", periode=" + periode + ", cm=" + cm + ", opt=" + opt + ", Code_service=" + Code_service
				+ ", Regime=" + Regime + ", Num_id_et=" + Num_id_et + ", N_TVA_intracommunautaire="
				+ N_TVA_intracommunautaire + ", T1=" + T1 + ", T2=" + T2 + ", T3=" + T3 + ", mod_dec=" + mod_dec
				+ ", reserv_admin=" + reserv_admin + ", date=" + date + ", phone=" + phone + ", date_2=" + date_2
				+ ", Somme=" + Somme + ", penalites=" + penalites + ", penalite_taux_5=" + penalite_taux_5
				+ ", penalite_taux_x=" + penalite_taux_x + ", penalite_taux_y=" + penalite_taux_y
				+ ", Si_vous_payez_par_virements_precisez_le_nombre=" + Si_vous_payez_par_virements_precisez_le_nombre
				+ ", date_reception=" + date_reception + ", A1_979=" + A1_979 + ", A2_981=" + A2_981 + ", A3_44="
				+ A3_44 + ", A4_56=" + A4_56 + ", A5_51=" + A5_51 + ", B1_48=" + B1_48 + ", B2_31=" + B2_31 + ", B3_30="
				+ B3_30 + ", B4_40=" + B4_40 + ", B5_36=" + B5_36 + ", E1_32=" + E1_32 + ", E2_33=" + E2_33 + ", E3_47="
				+ E3_47 + ", E4_52=" + E4_52 + ", E5_53=" + E5_53 + ", E6_54=" + E6_54 + ", F1_55=" + F1_55 + ", F2_34="
				+ F2_34 + ", F3_29=" + F3_29 + ", F4_49=" + F4_49 + ", F5_50=" + F5_50 + ", F6_37=" + F6_37 + ", F7_43="
				+ F7_43 + ", F8_39=" + F8_39 + ", F9_61=" + F9_61 + ", TVA_brute_207=" + TVA_brute_207
				+ ", TVA_brute_105=" + TVA_brute_105 + ", TVA_brute_151=" + TVA_brute_151 + ", TVA_brute_201="
				+ TVA_brute_201 + ", TVA_brute_100=" + TVA_brute_100 + ", TVA_brute_1120=" + TVA_brute_1120
				+ ", TVA_brute_1110=" + TVA_brute_1110 + ", TVA_brute_1090=" + TVA_brute_1090 + ", TVA_brute_1081="
				+ TVA_brute_1081 + ", TVA_brute_1050=" + TVA_brute_1050 + ", TVA_brute_1040=" + TVA_brute_1040
				+ ", TVA_brute_1010=" + TVA_brute_1010 + ", TVA_brute_990=" + TVA_brute_990 + ", TVA_brute_900="
				+ TVA_brute_900 + ", TVA_brute_208=" + TVA_brute_208 + ", TVA_brute_152=" + TVA_brute_152
				+ ", TVA_brute_210=" + TVA_brute_210 + ", TVA_brute_211=" + TVA_brute_211 + ", TVA_brute_212="
				+ TVA_brute_212 + ", TVA_brute_213=" + TVA_brute_213 + ", TVA_brute_214=" + TVA_brute_214
				+ ", TVA_brute_215=" + TVA_brute_215 + ", TVA_brute_600=" + TVA_brute_600 + ", TVA_brute_602="
				+ TVA_brute_602 + ", total_TVA_brute=" + total_TVA_brute + ", TVA_brute_35=" + TVA_brute_35
				+ ", TVA_brute_38=" + TVA_brute_38 + ", TVA_deductible_703=" + TVA_deductible_703
				+ ", TVA_deductible_702=" + TVA_deductible_702 + ", TVA_deductible_59=" + TVA_deductible_59
				+ ", TVA_deductible_8001=" + TVA_deductible_8001 + ", TVA_deductible_603=" + TVA_deductible_603
				+ ", total_TVA_deductible=" + total_TVA_deductible + ", TVA_deductible_711=" + TVA_deductible_711
				+ ", credit_TVA_705=" + credit_TVA_705 + ", TVA_due_8900=" + TVA_due_8900 + ", TVA_due=" + TVA_due
				+ ", regul_1=" + regul_1 + ", regul_2=" + regul_2 + ", regul_3=" + regul_3 + ", credit_impute_TVA_X="
				+ credit_impute_TVA_X + ", credit_impute_TVA_x=" + credit_impute_TVA_x + ", repliquat_credit_Y="
				+ repliquat_credit_Y + ", repliquat_credit_y=" + repliquat_credit_y + ", taxe_due_1=" + taxe_due_1
				+ ", taxe_due_2=" + taxe_due_2 + ", montant_electricite=" + montant_electricite + ", montant_X1="
				+ montant_X1 + ", montant_Y1=" + montant_Y1 + ", montant_Z1=" + montant_Z1 + ", montant_gaz="
				+ montant_gaz + ", montant_X2=" + montant_X2 + ", montant_Y2=" + montant_Y2 + ", montant_Z2="
				+ montant_Z2 + ", montant_charbons=" + montant_charbons + ", montant_X3=" + montant_X3 + ", montant_Y3="
				+ montant_Y3 + ", montant_Z3=" + montant_Z3 + ", total_regul=" + total_regul
				+ ", credit_constate_total=" + credit_constate_total + ", montant_X4=" + montant_X4 + ", montant_Y4="
				+ montant_Y4 + ", montant_Z4=" + montant_Z4 + ", det_montant_pay_credit_TVA_TIC="
				+ det_montant_pay_credit_TVA_TIC + ", det_8002=" + det_8002 + ", det_8005=" + det_8005 + ", det_8003="
				+ det_8003 + ", det_8113=" + det_8113 + ", det_8114=" + det_8114 + ", det_8103=" + det_8103
				+ ", det_8901=" + det_8901 + ", det_9979=" + det_9979 + ", det_8123=" + det_8123 + ", det_9991="
				+ det_9991 + ", det_9992=" + det_9992 + "]";
	}
    
    

}
    
    
