package com.example.erp.dao.impl;

import com.example.erp.bean.Departments;
import com.example.erp.dao.DepartmentDao;
import com.example.erp.util.HibernateSessionUtil;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class DepartmentDaoImpl implements DepartmentDao {
    @Override
    public boolean addDepartment(Departments dept) {
        try (Session session = HibernateSessionUtil.getSession()) {
            Transaction transaction = session.beginTransaction();
            session.save(dept);
            transaction.commit();
            return true;
        } catch (HibernateException exception) {
            System.out.print(exception.getLocalizedMessage());
            return false;
        }
    }
}
