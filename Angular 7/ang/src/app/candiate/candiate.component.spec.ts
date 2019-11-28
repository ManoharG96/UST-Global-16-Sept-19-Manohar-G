import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { CandiateComponent } from './candiate.component';

describe('CandiateComponent', () => {
  let component: CandiateComponent;
  let fixture: ComponentFixture<CandiateComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ CandiateComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(CandiateComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
