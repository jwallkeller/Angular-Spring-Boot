package io.jack.server.resource;

import java.util.Map;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.jack.server.model.Response;
import io.jack.server.service.implementation.ServerServiceImpl;
import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/server")
@RequiredArgsConstructor
public class ServerResource {
	private final ServerServiceImpl serverService;
	
	public ResponseEntity<Response> getServers() {
		return ResponseEnity.ok(
				Response.builder()
				.timeStamp(now())
				.data(Map.of("servers", serverService.list(30)))
				.message("Servers retrieved")
				.status(OK)
				.statusCode(OK.value)
				.build()
				);
	}
}
