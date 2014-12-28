package com.neusoft.bedio.action;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.neusoft.bedio.service.ifac.HospitalBedlevelService;
import com.neusoft.bedio.service.ifac.NurseBedService;
import com.neusoft.bedio.service.ifac.NurseRoomService;
import com.neusoft.bedio.service.ifac.OfficeDepartmentService;
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

	private NurseBedService nurseBedService;
	private NurseRoomService nurseRoomService;
	private OfficeDepartmentService officeDepartmentService;
	private HospitalBedlevelService hospitalBedlevelService;

	public void setNurseBedService(NurseBedService nurseBedService) {
		this.nurseBedService = nurseBedService;
	}

	public void setNurseRoomService(NurseRoomService nurseRoomService) {
		this.nurseRoomService = nurseRoomService;
	}

	public void setOfficeDepartmentService(
			OfficeDepartmentService officeDepartmentService) {
		this.officeDepartmentService = officeDepartmentService;
	}

	public void setHospitalBedlevelService(
			HospitalBedlevelService hospitalBedlevelService) {
		this.hospitalBedlevelService = hospitalBedlevelService;
	}

	// 查询用户
	public String findall() {
		nurseBedList = nurseBedService.findAllNurseBed();
		return "findall";
	}

	public String find() {
		nurseRoomList = nurseRoomService.findAllNurseRoom();
		officeDepartmentList = officeDepartmentService
				.findAllOfficeDepartment();
		hospitalBedlevelList = hospitalBedlevelService
				.findAllHospitalBedlevel();
		nurseBed = nurseBedService.findById(nurseBed.getBedId());
		return "find";
	}

	// 显示增加页面
	public String showadd() {
		nurseRoomList = nurseRoomService.findAllNurseRoom();
		officeDepartmentList = officeDepartmentService
				.findAllOfficeDepartment();
		//System.out.println(officeDepartmentList.get(0).getNurseRooms().size());
		hospitalBedlevelList = hospitalBedlevelService
				.findAllHospitalBedlevel();
		return "showadd";
	}

	// 添加
	public String add() {
		data = new HashMap<String, Object>();
		nurseBed.setBedState((byte) 0);
		hospitalBedlevel = hospitalBedlevelService.findById(nurseBed
				.getHospitalBedlevel().getLevelId());
		nurseBed.setHospitalBedlevel(hospitalBedlevel);
		nurseRoom = nurseRoomService.findById(nurseBed.getNurseRoom()
				.getRoomId());
		nurseBed.setNurseRoom(nurseRoom);
		officeDepartment = officeDepartmentService.findById(nurseBed
				.getOfficeDepartment().getOfficId());
		nurseBed.setOfficeDepartment(officeDepartment);

		if (nurseBedService.saveNurseBed(nurseBed)) {
			data.put("statusCode", "200");
			data.put("message", "添加成功!");
			data.put("navTabId", "nurseBedList");
			data.put("forwardUrl", "");
			data.put("callbackType", "closeCurrent");

		} else {
			data.put("statusCode", "300");
			data.put("message", "添加失败");
		}
		return "add";
	}

	// 修改
	public String update() {
		data = new HashMap<String, Object>();
		nurseBed.setBedState((byte) 0);
		hospitalBedlevel = hospitalBedlevelService.findById(nurseBed
				.getHospitalBedlevel().getLevelId());
		nurseBed.setHospitalBedlevel(hospitalBedlevel);
		nurseRoom = nurseRoomService.findById(nurseBed.getNurseRoom()
				.getRoomId());
		nurseBed.setNurseRoom(nurseRoom);
		officeDepartment = officeDepartmentService.findById(nurseBed
				.getOfficeDepartment().getOfficId());
		nurseBed.setOfficeDepartment(officeDepartment);
		if (nurseBedService.updateNurseBed(nurseBed)) {
			data.put("statusCode", "200");
			data.put("message", "修改成功!");
			data.put("navTabId", "nurseBedList");
			data.put("forwardUrl", "");
			data.put("callbackType", "closeCurrent");
		} else {
			data.put("statusCode", "300");
			data.put("message", "修改失败");

		}
		return "update";
	}

	// 删除
	public String delete() {
		data = new HashMap<String, Object>();
		//System.out.println(nurseBed.getBedId());
		nurseBed = nurseBedService.findById(nurseBed.getBedId()+" ");
		//System.out.println(nurseBed.getClass());
		if (nurseBedService.deleteNurseBed(nurseBed)) {
			data.put("statusCode", "200");
			data.put("message", "删除成功!");
			data.put("navTabId", "nurseBedList");
			data.put("forwardUrl", "nurseBed/findall.action");
			data.put("callbackType", "forward");
		} else {
			data.put("statusCode", "300");
			data.put("message", "删除失败");
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
