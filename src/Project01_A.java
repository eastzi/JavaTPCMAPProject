import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import kr.tpc.BookDTO;

public class Project01_A {
	public static void main(String[] args) {
		//OBJ(BookDTO) -> JSON(String)
		BookDTO dto = new BookDTO("자바", 21000, "에어콘", 670);
		Gson g = new Gson();
		String json = g.toJson(dto);
		System.out.println(json);
		
		//JSON(String) -> OBJ(BookDTO)
		BookDTO dto1 = g.fromJson(json, BookDTO.class); 
		System.out.println(dto1);
		System.out.println(dto1.getTitle());
		System.out.println(dto1.getPrice());
		System.out.println(dto1.getCompany());
		System.out.println(dto1.getPage());
		
		//OBJ(List<BookDTO>) -> JSON(String)
		List<BookDTO> list = new ArrayList<BookDTO>();
		list.add(new BookDTO("자바1", 21000, "에어컨1", 570));
		list.add(new BookDTO("자바2", 31000, "에어컨2", 670));
		list.add(new BookDTO("자바3", 41000, "에어컨3", 770));
		
		String listJson = g.toJson(list);
		System.out.println(listJson);
		
		//JSON(String) -> OBJ(List<BookDTO>)
		List<BookDTO> list2 = g.fromJson(listJson, new TypeToken<List<BookDTO>>() {}.getType());
		System.out.println(list2);
		for(BookDTO vo : list2) {
			System.out.println(vo);
		}
	}
}
