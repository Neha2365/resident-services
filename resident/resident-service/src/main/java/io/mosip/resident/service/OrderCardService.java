package io.mosip.resident.service;

import org.springframework.stereotype.Service;

import io.mosip.kernel.core.http.ResponseWrapper;
import io.mosip.resident.dto.ResidentCredentialRequestDto;
import io.mosip.resident.dto.ResidentCredentialResponseDto;
import io.mosip.resident.exception.ApisResourceAccessException;
import io.mosip.resident.exception.ResidentServiceCheckedException;

/**
 * Order card service class.
 * 
 * @author Ritik Jain
 */
@Service
public interface OrderCardService {

	/**
	 * Send a physical card.
	 * 
	 * @param requestDto
	 * @return ResidentCredentialResponseDto object
	 * @throws ResidentServiceCheckedException
	 */
	public ResidentCredentialResponseDto sendPhysicalCard(ResidentCredentialRequestDto requestDto)
			throws ResidentServiceCheckedException, ApisResourceAccessException;

	public ResponseWrapper<?> physicalCardOrder(String redirectUrl, String paymentTransactionId, String eventId, String residentFullAddress) throws ResidentServiceCheckedException;

}