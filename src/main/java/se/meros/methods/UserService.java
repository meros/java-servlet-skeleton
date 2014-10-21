package se.meros.methods;

import com.googlecode.jsonrpc4j.JsonRpcParam;

public class UserService {

	//	curl -XPOST http://localhost:8080/testservlet/ -d '{"method": "test","params": [1], "id": 1}'

	public int test(@JsonRpcParam("n") int n) {
		return n + 1;
	}
}
