import org.json.JSONArray;
import org.json.JSONObject;

public class Project01_B {

	public static void main(String[] args) {
		//JSON-Java(org.json)
		JSONArray students = new JSONArray();
		
		JSONObject student = new JSONObject();
		student.put("name", "이일일");
		student.put("phone", "010-1111-1111");
		student.put("address", "부산");
		System.out.println(student);
		
		students.put(student);
		
		student = new JSONObject();
		student.put("name", "이이이");
		student.put("phone", "010-2222-2222");
		student.put("address", "서울");
		System.out.println(student);
		
		students.put(student);
		System.out.println(students);
		
		JSONObject object = new JSONObject();
		object.put("students", students);
		
		System.out.println(object);
		System.out.println(object.toString(2));
	}

}
