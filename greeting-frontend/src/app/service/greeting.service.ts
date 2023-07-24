import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { environment } from 'src/environments/environment';

@Injectable({
  providedIn: 'root'
})

export class GreetingService {
    private apiServiceUrl = `${environment.apiUrl}/greeting`;
    
    constructor(private http: HttpClient) {
    }

    getGreeting() {
        return this.http.get(this.apiServiceUrl);
    }

}
