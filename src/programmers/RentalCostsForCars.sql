SElECT c.CAR_ID, c.CAR_TYPE, round(DAILY_FEE*(100-DISCOUNT_RATE) / 100*30) as FEE
from CAR_RENTAL_COMPANY_CAR c
left join CAR_RENTAL_COMPANY_RENTAL_HISTORY h
on c.car_id = h.car_id
left join CAR_RENTAL_COMPANY_DISCOUNT_PLAN p
on c.CAR_TYPE = p.CAR_TYPE
where duration_type LIKE '30%'
AND c.CAR_ID not in(Select CAR_ID 
                    from CAR_RENTAL_COMPANY_RENTAL_HISTORY 
                    where END_DATE > '2022-11-01' AND START_DATE < '2022-11-30' )
group by c.CAR_ID
having (c.CAR_TYPE = '세단' or c.CAR_TYPE = 'SUV') AND (FEE >= 500000 AND FEE < 2000000)
order by FEE DESC, CAR_TYPE asc, car_id DESC
