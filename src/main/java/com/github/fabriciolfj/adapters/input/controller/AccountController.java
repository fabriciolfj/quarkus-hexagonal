package com.github.fabriciolfj.adapters.input.controller;

import com.github.fabriciolfj.adapters.input.controller.mapper.AccountDtoMapper;
import com.github.fabriciolfj.application.usecases.AccountCreateUsecase;
import lombok.RequiredArgsConstructor;

import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;
import java.math.BigDecimal;

@Path("/api/v1/accounts")
@RequiredArgsConstructor
public class AccountController {

    private final AccountCreateUsecase usecase;

    @POST
    @Path("/balance/{value}")
    public Response create(@PathParam("value") final BigDecimal balance) {
        var account = usecase.execute(balance);
        return Response.status(Response.Status.CREATED)
                .entity(AccountDtoMapper.toResponse(account))
                .build();
    }
}
