import java.lang.reflect.Member;
import java.util.ArrayList;
import java.util.List;

import Member.*;

import static java.lang.Math.*;

public class main {
    public static void main(String[] args){

        // 배열 (int, char, String)  , 클래스 참조,  인터페이스 생성,
        // 오버로딩/오버라이드 , 생성자 , 상속 , static/final/abstract , 다형성 , 예외처리,
        // 람다/stream


        /* 14명 축구 선수 중 감독의 전력에 맞는 11명을 선발 라인업에 넣기
           15명 선수 배열에 저장해서 관리. 각 선수별 세부 능력 클래스로 관리. 세부 능력 기준은 인터페이스.
           몇몇 선수는 특별 능력( 오버라이딩으로 관리 ), 자식이 있는 선수는 상속으로 관리.

         */


        List<Integer> GK = new ArrayList<Integer>();
        List<Integer> DF = new ArrayList<Integer>();
        List<Integer> MF = new ArrayList<Integer>();
        List<Integer> FW = new ArrayList<Integer>();

        List<String> Best_Lineup = new ArrayList<String>();
        List<String> All_member = new ArrayList<String>();

        GK_A gk_a = new GK_A();
        GK_B gk_b = new GK_B();

        DF_A df_a = new DF_A();
        DF_B df_b = new DF_B();
        DF_C df_c = new DF_C();
        DF_D df_d = new DF_D();
        DF_E df_e = new DF_E();

        MF_A mf_a = new MF_A();
        MF_B mf_b = new MF_B();
        MF_C mf_c = new MF_C();
        MF_D mf_d = new MF_D();

        FW_A fw_a = new FW_A();
        FW_B fw_b = new FW_B();
        FW_C fw_c = new FW_C();
        FW_D fw_d = new FW_D();






        Calculate calculate = new Calculate();

        // GK 선발
        int gk_1 = (calculate.total_stat(gk_a.GK_stat(0)*50, gk_a.DF_stat(0), gk_a.MF_stat(0), gk_a.FW_stat(0),gk_a.Condition(0)));
        int gk_2 = (calculate.total_stat(gk_b.GK_stat(0)*50,gk_b.DF_stat(0), gk_b.MF_stat(0),gk_b.FW_stat(0),gk_b.Condition(0)));
        Best_Lineup.add("        < 오늘 경기 베스트 멤버 입니다. >\n\n");

        if (gk_1>=gk_2){
            Best_Lineup.add("                 GK_A\n\n");
        }
        else{
            Best_Lineup.add("                 GK_B\n\n");
        }

        // DF 선발
        int df_1 = (calculate.total_stat(df_a.GK_stat(0), df_a.DF_stat(0)*50, df_a.MF_stat(0), df_a.FW_stat(0),df_a.Condition(0)));
        int df_2 = (calculate.total_stat(df_b.GK_stat(0), df_b.DF_stat(0)*50, df_b.MF_stat(0), df_b.FW_stat(0),df_b.Condition(0)));
        int df_3 = (calculate.total_stat(df_c.GK_stat(0), df_c.DF_stat(0)*50, df_c.MF_stat(0), df_c.FW_stat(0),df_c.Condition(0)));
        int df_4 = (calculate.total_stat(df_d.GK_stat(0), df_d.DF_stat(0)*50, df_d.MF_stat(0), df_d.FW_stat(0),df_d.Condition(0)));
        int df_5 = (calculate.total_stat(df_e.GK_stat(0), df_e.DF_stat(0)*50, df_e.MF_stat(0), df_e.FW_stat(0),df_e.Condition(0)));

        int min_df = Math.min(Math.min(Math.min(Math.min(df_1,df_2),df_3),df_4),df_5);

        if (df_1>min_df){
            Best_Lineup.add("   DF_A");
        }
        if (df_2>min_df){
            Best_Lineup.add("   DF_B");
        }
        if (df_3>min_df){
            Best_Lineup.add("   DF_C");
        }
        if (df_4>min_df){
            Best_Lineup.add("   DF_D");
        }
        if (df_5>min_df){
            Best_Lineup.add("   DF_E");
        }



        // MF 선발
        int mf_1 = (calculate.total_stat(mf_a.GK_stat(0), mf_a.DF_stat(0), mf_a.MF_stat(0)*50, mf_a.FW_stat(0),mf_a.Condition(0)));
        int mf_2 = (calculate.total_stat(mf_b.GK_stat(0), mf_b.DF_stat(0), mf_b.MF_stat(0)*50, mf_b.FW_stat(0),mf_b.Condition(0)));
        int mf_3 = (calculate.total_stat(mf_c.GK_stat(0), mf_c.DF_stat(0), mf_c.MF_stat(0)*50, mf_c.FW_stat(0),mf_c.Condition(0)));
        int mf_4 = (calculate.total_stat(df_d.GK_stat(0), mf_d.DF_stat(0), mf_d.MF_stat(0)*50, mf_d.FW_stat(0),mf_d.Condition(0)));


        int min_mf = Math.min(Math.min(Math.min(mf_1,mf_2),mf_3),mf_4);

        Best_Lineup.add("\n\n");

        if (mf_1>min_mf){
            Best_Lineup.add("     MF_A");
        }
        if (mf_2>min_mf){
            Best_Lineup.add("     MF_B");
        }
        if (mf_3>min_mf){
            Best_Lineup.add("     MF_C");
        }
        if (mf_4>min_mf){
            Best_Lineup.add("     MF_D");
        }


        // FW 선발
        int fw_1 = (calculate.total_stat(fw_a.GK_stat(0), fw_a.DF_stat(0), fw_a.MF_stat(0)*50, fw_a.FW_stat(0),fw_a.Condition(0)));
        int fw_2 = (calculate.total_stat(fw_b.GK_stat(0), fw_b.DF_stat(0), fw_b.MF_stat(0)*50, fw_b.FW_stat(0),fw_b.Condition(0)));
        int fw_3 = (calculate.total_stat(fw_c.GK_stat(0), fw_c.DF_stat(0), fw_c.MF_stat(0)*50, fw_c.FW_stat(0),fw_c.Condition(0)));
        int fw_4 = (calculate.total_stat(fw_d.GK_stat(0), fw_d.DF_stat(0), fw_d.MF_stat(0)*50, fw_d.FW_stat(0),fw_d.Condition(0)));


        int min_fw = Math.min(Math.min(Math.min(fw_1,fw_2),fw_3),fw_4);
        Best_Lineup.add("\n\n");

        if (fw_1>min_fw){
            Best_Lineup.add("     FW_A");
        }
        if (fw_2>min_fw){
            Best_Lineup.add("     FW_B");
        }
        if (fw_3>min_fw){
            Best_Lineup.add("     FW_C");
        }
        if (fw_4>min_fw){
            Best_Lineup.add("     FW_D");
        }



        try{
            int length = Best_Lineup.toArray().length;
        }catch (NegativeArraySizeException e){
            System.out.println("선수가 한명도 선발되지 않았습니다.");
        }finally {
            System.out.println(Best_Lineup);
        }

    }


}
