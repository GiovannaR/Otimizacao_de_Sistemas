
import org.gnu.glpk.GLPK;
import org.gnu.glpk.GLPKConstants;
import org.gnu.glpk.GlpkException;
import org.gnu.glpk.SWIGTYPE_p_double;
import org.gnu.glpk.SWIGTYPE_p_int;
import org.gnu.glpk.glp_prob;
import org.gnu.glpk.glp_smcp;
public class Modelo_LojadeRoupas {

	public static void main(String[] arg) {
        glp_prob lp;
        glp_smcp parm;
        SWIGTYPE_p_int ind1;
        SWIGTYPE_p_double val1;
        
        SWIGTYPE_p_int ind2;
        SWIGTYPE_p_double val2;
        
        SWIGTYPE_p_int ind3;
        SWIGTYPE_p_double val3;
        
        SWIGTYPE_p_int ind4;
        SWIGTYPE_p_double val4;
        
        SWIGTYPE_p_int ind5;
        SWIGTYPE_p_double val5;
        
        SWIGTYPE_p_int ind6;
        SWIGTYPE_p_double val6;
        
        SWIGTYPE_p_int ind7;
        SWIGTYPE_p_double val7;
    
        int ret;

        //try {
            // Criar problema
            lp = GLPK.glp_create_prob();
            System.out.println("Problema criado");
            GLPK.glp_set_prob_name(lp, "LojadeRoupas");

            // Definir colunas, variaveis de decisao
            GLPK.glp_add_cols(lp, 9);
            //Calca jeans
            GLPK.glp_set_col_name(lp, 1, "CJ");
            GLPK.glp_set_col_kind(lp, 1, GLPKConstants.GLP_IV);
            GLPK.glp_set_col_bnds(lp, 1, GLPKConstants.GLP_LO, 3,0);
            
          //Bermuda jeans
            GLPK.glp_set_col_name(lp, 2, "BJ");
            GLPK.glp_set_col_kind(lp, 2, GLPKConstants.GLP_IV);
            GLPK.glp_set_col_bnds(lp, 2, GLPKConstants.GLP_LO, 4, 0);
            
          //Vestido A
            GLPK.glp_set_col_name(lp, 3, "VA");
            GLPK.glp_set_col_kind(lp, 3, GLPKConstants.GLP_IV);
            GLPK.glp_set_col_bnds(lp, 3, GLPKConstants.GLP_LO, 0, 0);
            
          //Vestido B
            GLPK.glp_set_col_name(lp, 4, "VB");
            GLPK.glp_set_col_kind(lp, 4, GLPKConstants.GLP_IV);
            GLPK.glp_set_col_bnds(lp, 4, GLPKConstants.GLP_LO, 0, 0);
            
          //Jaqueta A
            GLPK.glp_set_col_name(lp, 5, "JA");
            GLPK.glp_set_col_kind(lp, 5, GLPKConstants.GLP_IV);
            GLPK.glp_set_col_bnds(lp, 5, GLPKConstants.GLP_LO, 5, 0);
            
          //Jaqueta B
            GLPK.glp_set_col_name(lp, 6, "JB");
            GLPK.glp_set_col_kind(lp, 6, GLPKConstants.GLP_IV);
            GLPK.glp_set_col_bnds(lp, 6, GLPKConstants.GLP_LO, 0, 0);
            
          //Blusa A
            GLPK.glp_set_col_name(lp, 7, "BA");
            GLPK.glp_set_col_kind(lp, 7, GLPKConstants.GLP_IV);
            GLPK.glp_set_col_bnds(lp, 7, GLPKConstants.GLP_LO, 4, 0);
            
          //Blusa B
            GLPK.glp_set_col_name(lp, 8, "BB");
            GLPK.glp_set_col_kind(lp, 8, GLPKConstants.GLP_IV);
            GLPK.glp_set_col_bnds(lp, 8, GLPKConstants.GLP_LO, 0, 0);
            
          //Blusa C
            GLPK.glp_set_col_name(lp, 9, "BC");
            GLPK.glp_set_col_kind(lp, 9, GLPKConstants.GLP_IV);
            GLPK.glp_set_col_bnds(lp, 9, GLPKConstants.GLP_LO, 7, 0);
            

            //Criar_restricoes_tecidos
            GLPK.glp_add_rows(lp, 7);
            
            //Jeans---------------------------------------------
            GLPK.glp_set_row_name(lp, 1, "Jeans");
            GLPK.glp_set_row_bnds(lp, 1, GLPKConstants.GLP_UP, 0, 50);

            ind1 = GLPK.new_intArray(4);
            val1 = GLPK.new_doubleArray(4);
            
            GLPK.intArray_setitem(ind1, 1, 1);//CJ
            GLPK.intArray_setitem(ind1, 2, 2);//BJ
            GLPK.intArray_setitem(ind1, 3, 5);//JA
            
            GLPK.doubleArray_setitem(val1, 1, 1.30);
            GLPK.doubleArray_setitem(val1, 2, 0.80);
            GLPK.doubleArray_setitem(val1, 3, 1.30);
            GLPK.glp_set_mat_row(lp, 1, 3, ind1, val1);
            
          //Algodao---------------------------------------------
            GLPK.glp_set_row_name(lp, 2, "Algodao");
            GLPK.glp_set_row_bnds(lp, 2, GLPKConstants.GLP_UP, 0, 60);
            
            ind2 = GLPK.new_intArray(4);
            val2 = GLPK.new_doubleArray(4);
            
            GLPK.intArray_setitem(ind2, 1, 6);//JB
            GLPK.intArray_setitem(ind2, 2, 7);//BA
            GLPK.intArray_setitem(ind2, 3, 8);//BB
            
            GLPK.doubleArray_setitem(val2, 1, 1.20);
            GLPK.doubleArray_setitem(val2, 2, 1.10);
            GLPK.doubleArray_setitem(val2, 3, 1.10);
            GLPK.glp_set_mat_row(lp, 2, 3, ind2, val2);
            
            //Viscose--------------------------------------------
            GLPK.glp_set_row_name(lp, 3, "Viscose");
            GLPK.glp_set_row_bnds(lp, 3, GLPKConstants.GLP_UP, 0, 50);

            ind3 = GLPK.new_intArray(4);
            val3 = GLPK.new_doubleArray(4);
            
            GLPK.intArray_setitem(ind3, 1, 3);//VA
            GLPK.intArray_setitem(ind3, 2, 6);//JB
            GLPK.intArray_setitem(ind3, 3, 8);//BB
            
            GLPK.doubleArray_setitem(val3, 1, 1.20);
            GLPK.doubleArray_setitem(val3, 2, 0.60);
            GLPK.doubleArray_setitem(val3, 3, 0.90);
            GLPK.glp_set_mat_row(lp, 3, 3, ind3, val3);
            
            //Linho----------------------------------------------
            GLPK.glp_set_row_name(lp, 4, "Linho");
            GLPK.glp_set_row_bnds(lp, 4, GLPKConstants.GLP_UP, 0, 70);

            ind4 = GLPK.new_intArray(5);
            val4 = GLPK.new_doubleArray(5);
            
            GLPK.intArray_setitem(ind4, 1, 4);//VB
            GLPK.intArray_setitem(ind4, 2, 5);//JA
            GLPK.intArray_setitem(ind4, 3, 7);//BA
            GLPK.intArray_setitem(ind4, 4, 9);//BC
            
            GLPK.doubleArray_setitem(val4, 1, 1.30);
            GLPK.doubleArray_setitem(val4, 2, 0.40);
            GLPK.doubleArray_setitem(val4, 3, 0.40);
            GLPK.doubleArray_setitem(val4, 4, 1.10);
            GLPK.glp_set_mat_row(lp, 4, 4, ind4, val4);
            
            //Renda----------------------------------------------
            GLPK.glp_set_row_name(lp, 5, "Renda");
            GLPK.glp_set_row_bnds(lp, 5, GLPKConstants.GLP_UP, 0, 80);

            ind5 = GLPK.new_intArray(6);
            val5 = GLPK.new_doubleArray(6);
            
            GLPK.intArray_setitem(ind5, 1, 1);//CJ
            GLPK.intArray_setitem(ind5, 2, 2);//BJ
            GLPK.intArray_setitem(ind5, 3, 3);//VA
            GLPK.intArray_setitem(ind5, 4, 4);//VB
            GLPK.intArray_setitem(ind5, 5, 9);//BC

            GLPK.doubleArray_setitem(val5, 1, 0.70);
            GLPK.doubleArray_setitem(val5, 2, 0.50);
            GLPK.doubleArray_setitem(val5, 3, 1.0);
            GLPK.doubleArray_setitem(val5, 4, 1.0);
            GLPK.doubleArray_setitem(val5, 5, 0.60);
            GLPK.glp_set_mat_row(lp, 5, 5, ind5, val5);
            
            //Linha----------------------------------------------
            GLPK.glp_set_row_name(lp, 6, "Linha");
            GLPK.glp_set_row_bnds(lp, 6, GLPKConstants.GLP_UP, 0, 100);

            ind6 = GLPK.new_intArray(10);
            val6 = GLPK.new_doubleArray(10);
            
            GLPK.intArray_setitem(ind6, 1, 1);//CJ
            GLPK.intArray_setitem(ind6, 2, 2);//BJ
            GLPK.intArray_setitem(ind6, 3, 3);//VA
            GLPK.intArray_setitem(ind6, 4, 4);//VB
            GLPK.intArray_setitem(ind6, 5, 5);//JA
            GLPK.intArray_setitem(ind6, 6, 6);//JB
            GLPK.intArray_setitem(ind6, 7, 7);//BA
            GLPK.intArray_setitem(ind6, 8, 8);//BB
            GLPK.intArray_setitem(ind6, 9, 9);//BC

            GLPK.doubleArray_setitem(val6, 1, 1.0);
            GLPK.doubleArray_setitem(val6, 2, 0.0);
            GLPK.doubleArray_setitem(val6, 3, 1.0);
            GLPK.doubleArray_setitem(val6, 4, 1.0);
            GLPK.doubleArray_setitem(val6, 5, 1.0);
            GLPK.doubleArray_setitem(val6, 6, 1.0);
            GLPK.doubleArray_setitem(val6, 7, 1.0);
            GLPK.doubleArray_setitem(val6, 8, 1.0);
            GLPK.doubleArray_setitem(val6, 9, 1.0);
            GLPK.glp_set_mat_row(lp, 6, 9, ind6, val6);
            
            //Producao-------------------------------------------
            GLPK.glp_set_row_name(lp, 7, "Producao");
            GLPK.glp_set_row_bnds(lp, 7, GLPKConstants.GLP_UP, 0, 528);

            ind7 = GLPK.new_intArray(10);
            val7 = GLPK.new_doubleArray(10);
            
            GLPK.intArray_setitem(ind7, 1, 1);//CJ
            GLPK.intArray_setitem(ind7, 2, 2);//BJ
            GLPK.intArray_setitem(ind7, 3, 3);//VA
            GLPK.intArray_setitem(ind7, 4, 4);//VB
            GLPK.intArray_setitem(ind7, 5, 5);//JA
            GLPK.intArray_setitem(ind7, 6, 6);//JB
            GLPK.intArray_setitem(ind7, 7, 7);//BA
            GLPK.intArray_setitem(ind7, 8, 8);//BB
            GLPK.intArray_setitem(ind7, 9, 9);//BC

            GLPK.doubleArray_setitem(val7, 1, 7);
            GLPK.doubleArray_setitem(val7, 2, 5);
            GLPK.doubleArray_setitem(val7, 3, 8);
            GLPK.doubleArray_setitem(val7, 4, 10);
            GLPK.doubleArray_setitem(val7, 5, 6);
            GLPK.doubleArray_setitem(val7, 6, 7);
            GLPK.doubleArray_setitem(val7, 7, 4);
            GLPK.doubleArray_setitem(val7, 8, 6);
            GLPK.doubleArray_setitem(val7, 9, 5);
            GLPK.glp_set_mat_row(lp, 7, 9, ind7, val7);
         

            // Liberar memoria
            GLPK.delete_intArray(ind1);
            GLPK.delete_doubleArray(val1);
            GLPK.delete_intArray(ind2);
            GLPK.delete_doubleArray(val2);
            GLPK.delete_intArray(ind3);
            GLPK.delete_doubleArray(val3);
            GLPK.delete_intArray(ind4);
            GLPK.delete_doubleArray(val4);
            GLPK.delete_intArray(ind5);
            GLPK.delete_doubleArray(val5);
            GLPK.delete_intArray(ind6);
            GLPK.delete_doubleArray(val6);
            GLPK.delete_intArray(ind7);
            GLPK.delete_doubleArray(val7);
            
            // Funcao objetiva
            GLPK.glp_set_obj_name(lp, "z");
            GLPK.glp_set_obj_dir(lp, GLPKConstants.GLP_MAX);

            GLPK.glp_set_obj_coef(lp, 1, 45);//CJ
            GLPK.glp_set_obj_coef(lp, 2, 35);//BJ
            GLPK.glp_set_obj_coef(lp, 3, 62.5);//VA
            GLPK.glp_set_obj_coef(lp, 4, 70);//VB
            GLPK.glp_set_obj_coef(lp, 5, 27.5);//JA
            GLPK.glp_set_obj_coef(lp, 6, 45);//JB
            GLPK.glp_set_obj_coef(lp, 7, 25);//BA
            GLPK.glp_set_obj_coef(lp, 8, 40);//BB
            GLPK.glp_set_obj_coef(lp, 9, 30);//BC
            
 //-------------------------------------------------

            // Solve model
            parm = new glp_smcp();
            GLPK.glp_init_smcp(parm);
            ret = GLPK.glp_simplex(lp, parm);

             //Retrieve solution
            if (ret == 0) {
                write_lp_solution(lp);
            } else {
                System.out.println("O problema não pode ser resolvido");
            }

        //} catch (GlpkException ex) {
        //    ex.printStackTrace();
        //}
    }
	/**
     * write simplex solution
     * @param lp problem
     */
    static void write_lp_solution(glp_prob lp) {
        int i;
        int n;
        String name;
        double val;
        name = GLPK.glp_get_obj_name(lp);
        val = GLPK.glp_get_obj_val(lp);
        System.out.print(name);
        System.out.print(" = ");
        System.out.println(val);
        n = GLPK.glp_get_num_cols(lp);
        for (i = 1; i <= n; i++) {
            name = GLPK.glp_get_col_name(lp, i);
            val = GLPK.glp_get_col_prim(lp, i);
            System.out.print(name);
            System.out.print(" = ");
            System.out.println(val);
        }
    }

}
