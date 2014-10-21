package se.meros.methods;

import com.googlecode.jsonrpc4j.JsonRpcParam;

public class UserService {

	int test(@JsonRpcParam("n") int n) {
		return n + 1;
	}
}
