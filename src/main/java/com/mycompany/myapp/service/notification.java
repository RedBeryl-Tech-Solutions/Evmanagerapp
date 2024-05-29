//package com.mycompany.myapp.service;
//import com.mycompany.myapp.domain.SubscriptionDetails;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.jdbc.core.JdbcTemplate;
//import org.springframework.scheduling.annotation.Scheduled;
//import org.springframework.stereotype.Service;
//
//import java.util.List;
//
//    @Service
//    public class notification {
//
//        private final JdbcTemplate jdbcTemplate;
//
//        @Autowired
//        public notification(JdbcTemplate jdbcTemplate) {
//            this.jdbcTemplate = jdbcTemplate;
//        }
//
//        @Scheduled(cron = "0 0/5 * * * ?") // Runs every 5 minutes
//        public void fetchDataFromDatabase() {
//            // Write your SQL query to fetch data from the database
//            String sql = "SELECT * FROM SubscriptionDetails";
//
//            // Execute the query and process the results
//            List<SubscriptionDetails> subscriptions = jdbcTemplate.query(sql, (rs, rowNum) -> {
//                SubscriptionDetails subscription = new SubscriptionDetails();
//                subscription.setSubscriptionName(rs.getString("subscription_name"));
//                // Populate other subscription details similarly
//                return subscription;
//            });
//
//            // Process fetched data as needed (e.g., send email notifications)
//            processFetchedData(subscriptions);
//        }
//
//        private void processFetchedData(List<SubscriptionDetails> subscriptions) {
//            // Implement your logic to process the fetched data (e.g., send email notifications)
//            for (SubscriptionDetails subscription : subscriptions) {
//                // Send email notifications or perform other actions
//                sendEmail(subscription.getEmail(), "subject", "message");
//            }
//        }
//
//        private void sendEmail(String to, String subject, String message) {
//            // Implement email sending logic here
//        }
//    }
//
//
