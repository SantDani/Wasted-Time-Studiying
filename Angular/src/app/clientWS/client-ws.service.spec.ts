import { TestBed } from '@angular/core/testing';

import { ClientWSService } from './client-ws.service';

describe('ClientWSService', () => {
  beforeEach(() => TestBed.configureTestingModule({}));

  it('should be created', () => {
    const service: ClientWSService = TestBed.get(ClientWSService);
    expect(service).toBeTruthy();
  });
});
