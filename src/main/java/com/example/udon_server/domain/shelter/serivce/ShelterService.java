package com.example.udon_server.domain.shelter.serivce;


import com.example.udon_server.domain.shelter.presentation.dto.request.ShelterDetailRequest;
import com.example.udon_server.domain.shelter.presentation.dto.response.ShelterListResponse;

public interface ShelterService {

    ShelterListResponse getDetail(ShelterDetailRequest req);
}
