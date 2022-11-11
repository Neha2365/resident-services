package io.mosip.resident.interceptor;

import java.io.Serializable;
import java.util.Arrays;
import java.util.List;

import org.hibernate.EmptyInterceptor;
import org.hibernate.type.Type;
import org.springframework.stereotype.Component;

import io.mosip.resident.entity.ResidentTransactionEntity;
import io.mosip.resident.exception.ResidentServiceException;
import io.mosip.resident.util.IndividualId;
@Component
public class ResidentInterceptor extends EmptyInterceptor {
	
	@Override
	public boolean onSave(Object entity, Serializable id, Object[] state, String[] propertyNames, Type[] types) {
		try {
			List<String> propertyNamesList = Arrays.asList(propertyNames);
			if (entity instanceof ResidentTransactionEntity) {
				
			}
		} catch (ResidentServiceException e) {
			
		}
		return super.onSave(entity, id, state, propertyNames, types);
	}

}
