package com.jzfactory.jd.dao;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.jzfactory.jd.bean.Master;

public class TestStatusDAO extends BaseHibernateDAO {

	/**
	 * ������ʱ״̬���־�״̬��ת��
	 */
	public void testT2P()
	{
		
	}
	/**
	 * ������ʱ״̬���־�״̬�󣬸��������ύ��
	 */
	public void testT2P2Update()
	{
		
	}
	/**
	 * ���Գ־�״̬�޸ĺ��ύ
	 */
	public void testP2Update()
	{
		
	}
	/**
	 * ���־�̬ת��Ϊ����̬������ύ
	 * clear �� evict �� session�ر�
	 */
	public void testP2D2Update()
	{
		
	}
	/**
	 * ���־�̬ת��Ϊ��ʱ̬
	 */
	public void testP2T()
	{
		
	}
	/**
	 * ͬ���־û�����
	 */
	public void testRefresh()
	{
		
	}
	/**
	 * ������̬ת���ɳ־�̬
	 */
	public void testD2P()
	{
		Session session=getSession();
		
		Transaction trans=session.beginTransaction();
		Master master=new Master();
		master.setId(3);
		session.update(master);
		trans.commit();
	}
	/**
	 * �־�״̬�޸�id
	 */
	public void testP2EditId()
	{
		
	}
	/**
	 * ����̬ת��Ϊ��ʱ״̬
	 */
	public void testD2S()
	{
		
	}
	/**
	 * �����ظ��ĳ־û�����
	 */
	public void testDuplicateP()
	{
		
	}
	/**
	 * �����ظ��ĳ־û�����
	 */
	public void testRemoveDupli()
	{
		
	}
	
	public static void main(String[] args) {
		TestStatusDAO dao=new TestStatusDAO();
	    dao.testD2P();
	}
}
