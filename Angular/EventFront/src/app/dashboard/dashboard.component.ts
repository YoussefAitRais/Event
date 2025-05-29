import { Component } from '@angular/core';
import { CommonModule } from '@angular/common';
import { MatSidenavModule } from '@angular/material/sidenav';
import { MatToolbarModule } from '@angular/material/toolbar';
import { MatIconModule } from '@angular/material/icon';
import { MatListModule } from '@angular/material/list';
import { MatCardModule } from '@angular/material/card';
import { MatButtonModule } from '@angular/material/button';
import { MatTableModule } from '@angular/material/table';
import { NgxChartsModule } from '@swimlane/ngx-charts';
import { ScaleType } from '@swimlane/ngx-charts';

@Component({
  selector: 'app-dashboard',
  standalone: true,
  imports: [
    CommonModule,
    MatSidenavModule,
    MatToolbarModule,
    MatIconModule,
    MatListModule,
    MatCardModule,
    MatButtonModule,
    MatTableModule,
    NgxChartsModule
  ],
  templateUrl: './dashboard.component.html',
  styleUrls: ['./dashboard.component.css']
})
export class DashboardComponent {
  sales = 975.5;
  tickets = { sold: 300, total: 500 };
  views = 300;
  users = 180;

  displayedColumns: string[] = ['type', 'price', 'sold', 'endDate', 'status'];
  ticketData = [
    { type: 'General Admission', price: '$20', sold: '0/200', endDate: '31/03/24', status: 'Selling Fast' },
    { type: 'VIP', price: '$50', sold: '0/100', endDate: '31/03/24', status: 'On Sale' }
  ];

  chartData = [
    { name: 'Mon', value: 200 },
    { name: 'Tue', value: 450 },
    { name: 'Wed', value: 300 },
    { name: 'Thu', value: 500 },
    { name: 'Fri', value: 600 }
  ];

  colorScheme = {
    name: 'customBlue',
    selectable: true,
    group: ScaleType.Ordinal,
    domain: ['#1976d2', '#42a5f5', '#90caf9']
  };
}
