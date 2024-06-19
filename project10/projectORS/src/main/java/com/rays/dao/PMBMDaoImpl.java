package com.rays.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import org.springframework.stereotype.Repository;

import com.rays.common.BaseDAOImpl;
import com.rays.dto.PMBMDTO;


@Repository
public class PMBMDaoImpl extends BaseDAOImpl<PMBMDTO> implements PMBMDaoInt{

	@Override
	protected List<Predicate> getWhereClause(PMBMDTO dto, CriteriaBuilder builder, Root<PMBMDTO> qRoot) {
		// Create where conditions
				List<Predicate> whereCondition = new ArrayList<Predicate>();

				if (!isEmptyString(dto.getProjectName())) {

					whereCondition.add(builder.like(qRoot.get("projectName"), dto.getProjectName() + "%"));
				}
				if (!isEmptyString(dto.getProjectDescription())) {

					whereCondition.add(builder.like(qRoot.get("projectDescription"), dto.getProjectDescription() + "%"));
				}

				if (!isEmptyString(dto.getStartDate())) {

					whereCondition.add(builder.like(qRoot.get("startDate"), dto.getStartDate() + "%"));
				}

				if (!isEmptyString(dto.getEndDate())) {

					whereCondition.add(builder.like(qRoot.get("endDate"), dto.getEndDate()));
				}
				
				if (!isZeroNumber(dto.getId())) {

					whereCondition.add(builder.equal(qRoot.get("id"), dto.getId()));
				}

				return whereCondition;
	}

	@Override
	public Class<PMBMDTO> getDTOClass() {
		// TODO Auto-generated method stub
		return PMBMDTO.class;
	}

}
