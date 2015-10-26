package data.userdata;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;

import po.UserPO;
import dataservice.MyList;
import dataservice.userdataservice.UserDataService;


public class UserDataImpl extends UnicastRemoteObject implements UserDataService {

	public UserDataImpl() throws RemoteException {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	

	private String spt = ":%:%:";
	
	public UserPO toPO(String s){
		return new UserPO(s.split(spt));
	}
	public boolean write(ArrayList<UserPO> r){

		File file = new File("file"+File.separator+"user.txt");
		try {
			FileWriter fW = new FileWriter(file);
			BufferedWriter br = new BufferedWriter(fW);
			for (UserPO userPO : r) {
				br.write(userPO.toString()+"\n");
			}
			br.flush();
			br.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return true;
	}
	
	@Override
	public MyList<UserPO> allUsers() {
		MyList<UserPO> re = new MyList<UserPO>();
		File file = new File("file"+File.separator+"user.txt");
		try {
			FileReader fr = new FileReader(file);
			BufferedReader br = new BufferedReader(fr);
			String record = null;
			while ((record = br.readLine()) != null) {
				re.add(this.toPO(record));
			}
			br.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return re;
	}

	@Override
	public boolean add(UserPO user) {
		
		ArrayList<UserPO> re = this.allUsers();
		re.add(user);
		this.write(re);
		return true;
	}

	@Override
	public UserPO find(String id) {
		ArrayList<UserPO> re = this.allUsers();
		for (UserPO userPO : re) {
			if(userPO.getId().equals(id)) return userPO;
		}
		return null;
	}

	@Override
	public boolean delete(UserPO user) {
		
			ArrayList<UserPO> re = this.allUsers();
			re.remove(user);
			this.write(re);
		    return true;
		
		
		
	}

	@Override
	public boolean update(UserPO old) {
		ArrayList<UserPO> re = this.allUsers();
		for (UserPO userPO : re) {
			if(old.getId().equals(userPO.getId())){
				re.remove(userPO);
				re.add(old);
				break;
			}
		}
        this.write(re);
        return true;
	}
    
	

	
}


