application has billing and printing options


billing 
    - new bill creation
voiding 
    -void existing bills and issue refund
react js and all testing to be in place (junit and mockit)
deploy the app to EKS and monitor the access and other features using Kibana and Elastic search
#flow 

user (login) -- > screen(new receipt / )
                                        print
                                        void
            -->all void older bills (with reason)
            --report  -- > all transactions



# restart mysql service
sudo service mysql stop
sudo usermod -d /var/lib/mysql/ mysql
sudo service mysql start


