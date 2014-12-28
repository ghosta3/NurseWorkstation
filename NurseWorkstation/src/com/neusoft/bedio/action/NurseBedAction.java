package com.neusoft.bedio.action;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.neusoft.bedio.service.ifac.HospitalBedlevelServiceIfac;
import com.neusoft.bedio.service.ifac.NurseBedServiceIfac;
import com.neusoft.bedio.service.ifac.NurseRoomServiceIfac;
import com.neusoft.bedio.service.ifac.OfficeDepartmentServiceIfac;
import com.neusoft.common.domain.HospitalBedlevel;
import com.neusoft.common.domain.NurseBed;
import com.neusoft.common.domain.NurseRoom;
import com.neusoft.common.domain.OfficeDepartment;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

public class NurseBedAction extends ActionSupport implements
		ModelDriven<NurseBed> {

	private static final long serialVersionUID = 1L;
	private NurseBed nurseBed;
	private OfficeDepartment officeDepartment;
	private HospitalBedlevel hospitalBedlevel;
	private NurseRoom nurseRoom;
	private List<NurseBed> nurseBedList;
	private Map<String, Object> data;
	private List<NurseRoom> nurseRoomList;
	private List<OfficeDepartment> officeDepartmentList;
	private List<HospitalBedlevel> hospitalBedlevelList;
	
	@Override
	public NurseBed getModel() {
		if (nurseBed == null) {
			nurseBed = new NurseBed();
		}
		return nurseBed;
	}

	private NurseBedServiceIfac nurseBedServiceIfac;
	private NurseRoomServiceIfac nurseRoomServiceIfac;
	private OfficeDepartmentServiceIfac officeDepartmentServiceIfac;
	private HospitalBedlevelServiceIfac hospitalBedlevelServiceIfac;

	public void setNurseBedServiceIfac(NurseBedServiceIfac nurseBedServiceIfac) {
		this.nurseBedServiceIfac = nurseBedServiceIfac;
	}

	public void setNurseRoomServiceIfac(
			NurseRoomServiceIfac nurseRoomServiceIfac) {
		this.nurseRoomServiceIfac = nurseRoomServiceIfac;
	}

	public void setOfficeDepartmentServiceIfac(
			OfficeDepartmentServiceIfac officeDepartmentServiceIfac) {
		this.officeDepartmentServiceIfac = officeDepartmentServiceIfac;
	}

	public void setHospitalBedlevelServiceIfac(
			HospitalBedlevelServiceIfac hospitalBedlevelServiceIfac) {
		this.hospitalBedlevelServiceIfac = hospitalBedlevelServiceIfac;
	}

	// ��ѯ�û�
	public String findall() {
		nurseBedList = nurseBedServiceIfac.findAllNurseBed();
		return "findall";
	}

	public String find() {
		System.out.println(nurseBed.getBedId());
		nurseRoomList = nurseRoomServiceIfac.findAllNurseRoom();
		officeDepartmentList = officeDepartmentServiceIfac
				.findAllOfficeDepartment();
		hospitalBedlevelList = hospitalBedlevelServiceIfac
				.findAllHospitalBedlevel();
		nurseBed = nurseBedServiceIfac.findById(nurseBed.getBedId());
		return "find";
	}

	// ��ʾ����ҳ��
	public String showadd() {
		nurseRoomList = nurseRoomServiceIfac.findAllNurseRoom();
		officeDepartmentList = officeDepartmentServiceIfac
				.findAllOfficeDepartment();
		hospitalBedlevelList = hospitalBedlevelServiceIfac
				.findAllHospitalBedlevel();
		return "showadd";
	}

	// ���
	public String add() {
		data = new HashMap<String, Object>();
		nurseBed.setBedState((byte) 0);
		hospitalBedlevel = hospitalBedlevelServiceIfac.findById(nurseBed
				.getHospitalBedlevel().getLevelId());
		nurseBed.setHospitalBedlevel(hospitalBedlevel);
		nurseRoom = nurseRoomServiceIfac.findById(nurseBed.getNurseRoom()
				.getRoomId());
		nurseBed.setNurseRoom(nurseRoom);
		officeDepartment = officeDepartmentServiceIfac.findById(nurseBed
				.getOfficeDepartment().getOfficId());
		nurseBed.setOfficeDepartment(officeDepartment);

		if (nurseBedServiceIfac.saveNurseBed(nurseBed)) {
			data.put("statusCode", "200");
			data.put("message", "��ӳɹ�!");
			data.put("navTabId", "nurseBedList");
			data.put("forwardUrl", "");
			data.put("callbackType", "closeCurrent");

		} else {
			data.put("statusCode", "300");
			data.put("message", "���ʧ��");
		}
		return "add";
	}

	// �޸�
	public String update() {
		data = new HashMap<String, Object>();
		nurseBed.setBedState((byte) 0);
		hospitalBedlevel = hospitalBedlevelServiceIfac.findById(nurseBed
				.getHospitalBedlevel().getLevelId());
		nurseBed.setHospitalBedlevel(hospitalBedlevel);
		nurseRoom = nurseRoomServiceIfac.findById(nurseBed.getNurseRoom()
				.getRoomId());
		nurseBed.setNurseRoom(nurseRoom);
		officeDepartment = officeDepartmentServiceIfac.findById(nurseBed
				.getOfficeDepartment().getOfficId());
		nurseBed.setOfficeDepartment(officeDepartment);
		if (nurseBedServiceIfac.updateNurseBed(nurseBed)) {
			data.put("statusCode", "200");
			data.put("message", "�޸ĳɹ�!");
			data.put("navTabId", "nurseBedList");
			data.put("forwardUrl", "");
			data.put("callbackType", "closeCurrent");
		} else {
			data.put("statusCode", "300");
			data.put("message", "�޸�ʧ��");

		}
		return "update";
	}

	// ɾ��
	public String delete() {
		data = new HashMap<String, Object>();
		System.out.println(nurseBed.getBedId());
		nurseBed = nurseBedServiceIfac.findById(nurseBed.getBedId()+" ");
		System.out.println(nurseBed.getClass());
		if (nurseBedServiceIfac.deleteNurseBed(nurseBed)) {
			data.put("statusCode", "200");
			data.put("message", "ɾ���ɹ�!");
			data.put("navTabId", "nurseBedList");
			data.put("forwardUrl", "nurseBed/findall.action");
			data.put("callbackType", "forward");
		} else {
			data.put("statusCode", "300");
			data.put("message", "ɾ��ʧ��");
		}

		return "delete";
	}

	public NurseBed getNurseBed() {
		return nurseBed;
	}

	public void setNurseBed(NurseBed nurseBed) {
		this.nurseBed = nurseBed;
	}

	public List<NurseBed> getNurseBedList() {
		return nurseBedList;
	}

	public void setNurseBedList(List<NurseBed> nurseBedList) {
		this.nurseBedList = nurseBedList;
	}

	public Map<String, Object> getData() {
		return data;
	}

	public void setData(Map<String, Object> data) {
		this.data = data;
	}
	public List<NurseRoom> getNurseRoomList() {
		return nurseRoomList;
	}
	public void setOfficeDepartmentList(List<OfficeDepartment> officeDepartmentList) {
		this.officeDepartmentList = officeDepartmentList;
	}
	
	public void setNurseRoomList(List<NurseRoom> nurseRoomList) {
		this.nurseRoomList = nurseRoomList;
	}

	public List<OfficeDepartment> getOfficeDepartmentList() {
		return officeDepartmentList;
	}
	public List<HospitalBedlevel> getHospitalBedlevelList() {
		return hospitalBedlevelList;
	}
	public void setHospitalBedlevelList(List<HospitalBedlevel> hospitalBedlevelList) {
		this.hospitalBedlevelList = hospitalBedlevelList;
	}

}
