package com.design.behavioral.chainOfResponsibility;

/**
 * 副总经理
 * @author Administrator
 *
 */
public class ViceGeneralManager extends Leader{

	public ViceGeneralManager(String name) {
		super(name);
	}

	@Override
	public void handleRequest(LeaveRequest request) {
		// TODO Auto-generated method stub
		if(request.getLeaveDays()<20){
			System.out.println("员工："+request.getEmpName()+"请假，天数:"
					+request.getLeaveDays()+",理由:"+request.getReason());
			System.out.println("总经理:"+this.name+",审批通过");
		}else{
			if(this.nextLeader!=null){
				
				this.nextLeader.handleRequest(request);
			}
		}
	}

}
