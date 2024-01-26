package jsonpractice.test1;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.Gson;

public class JsonExample {
	public static void main(String[] args) {
        // Sample Java object
        SampleObject obj = new SampleObject("John Doe", 30, "john@example.com");

        // Gson initialization
        Gson gson = new Gson();

        // Convert Java object to JSON
        String json = gson.toJson(obj);

        // Display JSON representation
        System.out.println("JSON representation:");
        System.out.println(json);
    }
}

class SampleObject {
    private String name;
    private int age;
    private String email;

    public SampleObject(String name, int age, String email) {
        this.name = name;
        this.age = age;
        this.email = email;
    }

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "SampleObject [name=" + name + ", age=" + age + ", email=" + email + "]";
	}

    // Getters and setters (not necessary for Gson serialization)
}