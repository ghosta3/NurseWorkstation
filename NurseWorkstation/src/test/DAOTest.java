package test;

import java.util.Iterator;
import java.util.List;

import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.Restrictions;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.transaction.annotation.Transactional;

import com.neusoft.common.dao.ifac.BaseDAO;
import com.neusoft.common.dao.ifac.NursePatDAO;
import com.neusoft.common.dao.impl.HospitalBedlevelDAOImpl;
import com.neusoft.common.domain.HospitalBedlevel;
import com.neusoft.common.domain.HospitalDischarge;
import com.neusoft.common.domain.NurseBed;
import com.neusoft.common.domain.NursePat;
import com.neusoft.common.domain.NurseWork;

public class DAOTest {

	public static void main(String[] args) {
		//ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		
//		NurseWorkDAO nurseWorkDAO = (NurseWorkDAO) ctx.getBean("NurseWorkDAO");
//		List<NurseWork> nurseWorks = nurseWorkDAO.findAll();
//		
//		for(NurseWork nw : nurseWorks)
//			System.out.println(nw.getWorkName());
//		
//		HospitalDischargeDAO hospitalDischargeDAO = (HospitalDischargeDAO) ctx.getBean("HospitalDischargeDAO");
//		System.out.println("--------------------");
//		List<HospitalDischarge> hospitalDischarges = hospitalDischargeDAO.findAll();
//		for (HospitalDischarge hospitalDischarge : hospitalDischarges) {
//			System.out.println(hospitalDischarge.getNursePat().getPatName());
//		}
		
//		HospitalBedlevelDAO hospitalBedlevelDAO = (HospitalBedlevelDAO) ctx.getBean("HospitalBedlevelDAO");
//		HospitalBedlevel hospitalBedlevel = new HospitalBedlevel(56.0);
//		hospitalBedlevelDAO.save(hospitalBedlevel);
		//HospitalBedlevelDAOImpl hospitalBedlevelDAOImpl = (HospitalBedlevelDAOImpl) ctx.getBean("hospitalBedlevelDAO");
		//NursePatDAO nursePatDAO = (NursePatDAO) ctx.getBean("nursePatDAO");
		//NursePat n = nursePatDAO.findById("2    ");
		System.out.println(String.format("%-5s","ha"));
		
//		Criterion[] criterions = new Criterion[]{Restrictions.like("patCertificate", "%44%")};
//		for(NursePat h : nursePatDAO.findWithConditionByLimit(0, 2, criterions))
//			System.out.println(h.getPatName());
	}

}
