correct_inputs = False
impressions_per_minute = 2

while correct_inputs == False:
    print ""
    daily_active_users = input('Enter number of daily active users: ')
    if daily_active_users > 0:
        conversion_rate = input('Enter conversion rate (format: 2.4% is written 2.4): ')
        if conversion_rate >= 0.00 and conversion_rate <= 100.00:
            minutes_per_session = input('Enter average minutes per user session: ')
            if minutes_per_session >= 0.00:
                cost_per_mile = input('Enter CPM (format: $2.08 is written 2.08): ')
                if cost_per_mile >= 0.00:
                    revenue = (((((daily_active_users * (conversion_rate / 100)) * minutes_per_session) * impressions_per_minute) * cost_per_mile) / 1000)
                    print "Total generated revenue: $", str(revenue)
                    print ""
                    correct_inputs = True
