package quiz50;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import org.apache.commons.lang3.StringUtils;

public class MainClass {
	
	public static void main(String[] args) {

		BufferedReader br = null;

		List<Data> list = new ArrayList<>();

		
		try {

			br = new BufferedReader(new InputStreamReader(new FileInputStream("D:\\course\\java\\file\\주택도시보증공사_전국 평균 분양가격(2020년 2월).csv"),"EUC-KR"));

			
			String str;
			while((str = br.readLine()) != null) {
				Data d = new Data();
				d.setData(Arrays.asList(str.split(",", 5)));

				d.setR(d.getData().get(0));
				d.setS(d.getData().get(1));
				d.setY(d.getData().get(2));
				d.setM(d.getData().get(3));
				
				if(StringUtils.isBlank(d.getData().get(4))||d.getData().get(4).equals("-"))//d.getData().get(4).equals("")
					d.setP("0");
				else
					d.setP(d.getData().get(4).replace(",", "").replace("-", "").replace(" ", "").replace("\"", ""));
				list.add(d);

			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		
//		List<Data> l = list.stream().filter((d)->d.getR().equals("광주")).collect(Collectors.toList());
//		System.out.println(l.get(3).getP());
		
//		list.stream().filter((d)->d.getR().equals("광주")).filter((d)->Integer.parseInt(d.getM())%2==0).filter((d)->Integer.parseInt(d.getP())>=4000).forEach((d)->System.out.println(d.getP()));
		
		List<Data> last = list.stream().filter((d)->d.getR().equals("충남")).filter((d)->Integer.parseInt(d.getM())%2==0).filter((d)->Integer.parseInt(d.getP())>=3000).collect(Collectors.toList());
		last.forEach((d)->System.out.println("[R="+d.getR()+", S="+d.getS()+", Y="+d.getY()+", M="+d.getM()+", P="+d.getP()+"]"));
		System.out.println(last.size());

		
	}
}
